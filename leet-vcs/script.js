function fetchContests() {
    const username = document.getElementById("usernameInput").value;
    const apiUrl = `https://api.allorigins.win/raw?url=https://leetcode.com/graphql?query=query{%20userContestRanking(username:%20%22${username}%22)%20{attendedContestsCount%20rating%20globalRanking%20totalParticipants%20topPercentage}%20userContestRankingHistory(username:%20%22${username}%22)%20{attended%20trendDirection%20problemsSolved%20totalProblems%20finishTimeInSeconds%20rating%20ranking%20contest%20{title%20startTime}}}`;

    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            handleAllContests(data);
        })
        .catch(error => console.error('Error fetching data:', error));
}

function fetchUnattendedContests() {
    const username = document.getElementById("usernameInput").value;
    const apiUrl = `https://api.allorigins.win/raw?url=https://leetcode.com/graphql?query=query{%20userContestRanking(username:%20%22${username}%22)%20{attendedContestsCount%20rating%20globalRanking%20totalParticipants%20topPercentage}%20userContestRankingHistory(username:%20%22${username}%22)%20{attended%20trendDirection%20problemsSolved%20totalProblems%20finishTimeInSeconds%20rating%20ranking%20contest%20{title%20startTime}}}`;

    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            handleUnattendedContests(data);
        })
        .catch(error => console.error('Error fetching data:', error));
}

// Define remainingContests outside the handleContests function
let remainingContests = [];

function handleAllContests(data) {
    const userContestRankingHistory = data.data.userContestRankingHistory;
    remainingContests = userContestRankingHistory;
    displayContests(userContestRankingHistory);
}

function handleUnattendedContests(data) {
    const userContestRankingHistory = data.data.userContestRankingHistory;
    // Filter contests user already participated in
    const participatedContests = userContestRankingHistory
        .filter(contest => contest.attended)
        .map(contest => contest.contest.title);
    // Filter unattended contests
    remainingContests = userContestRankingHistory
        .filter(contest => !participatedContests.includes(contest.contest.title));
    displayContests(remainingContests);
}

function displayContests(contests) {
    const contestListElement = document.getElementById("contestList");
    contestListElement.innerHTML = "<h2>Remaining Contests:</h2>";

    contests.forEach(contest => {
        const contestTitle = contest.contest.title;
        const contestLink = `https://leetcode.com/contest/${contestTitle.toLowerCase().replace(/\s+/g, '-')}/`;
        const contestElement = document.createElement("div");
        contestElement.innerHTML = `<a href="${contestLink}" target="_blank">${contestTitle}</a>`;
        contestListElement.appendChild(contestElement);
    });

    const randomContestDiv = document.getElementById("randomContest");
    randomContestDiv.innerHTML = ""; // Clear any existing content

    const randomContestButton = document.createElement("button");
    randomContestButton.textContent = "Open Random Contest";
    randomContestButton.addEventListener("click", showRandomContest);
    randomContestDiv.appendChild(randomContestButton);
    const contestList = document.getElementById("contestList");
    contestList.style.display = "block";

}

function showRandomContest() {
    if (remainingContests.length > 0) {
        const randomIndex = Math.floor(Math.random() * remainingContests.length);
        const randomContest = remainingContests[randomIndex];
        window.open(`https://leetcode.com/contest/${randomContest.contest.title.toLowerCase().replace(/\s+/g, '-')}/`, '_blank');
    } else {
        alert("No remaining contests to show.");
    }
}

function saveUsername() {
    const usernameInput = document.getElementById("usernameInput").value;
    localStorage.setItem("previousUsername", usernameInput);
}

function loadPreviousUsername() {
    const savedUsername = localStorage.getItem("previousUsername");
    if (savedUsername) {
        document.getElementById("usernameInput").value = savedUsername;
    }
}

window.addEventListener("load", loadPreviousUsername);