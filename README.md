# Leet-VCS

This project is a web application that allows users to view their remaining LeetCode contests and randomly open a contest from the list. It fetches contest data from the LeetCode API and displays the contests in a list on the webpage.

## Features

- Fetch contest data from the LeetCode API based on the user's username
- Display all remaining contests the user hasn't attended
- Option to show only unattended contests
- Open a random contest from the list with a click of a button
- Save and load the previously entered username

## Usage

1. Enter your LeetCode username in the input field.
2. Click the "Fetch Contests" button to retrieve the list of contests you haven't attended.
3. Alternatively, click the "Fetch Unattended Contests" button to show only the contests you haven't participated in.
4. The remaining contests will be displayed in a list.
5. Click the "Open Random Contest" button to open a random contest from the list in a new tab.
6. The application will remember your username for the next visit.

## Implementation Details

The application uses JavaScript and the Fetch API to retrieve data from the LeetCode GraphQL API. It utilizes an external service (https://api.allorigins.win) to bypass CORS restrictions when making the API requests.

The `fetchContests` and `fetchUnattendedContests` functions fetch the contest data from the API and pass it to the respective handler functions (`handleAllContests` and `handleUnattendedContests`). These handler functions process the data and call the `displayContests` function to render the contest list on the webpage.

The `displayContests` function generates the contest list HTML elements and appends them to the `contestList` div. It also creates the "Open Random Contest" button and attaches a click event listener to it, which calls the `showRandomContest` function.

The `showRandomContest` function selects a random contest from the `remainingContests` array and opens it in a new tab using the appropriate URL format based on the contest type (regular, biweekly, or numbered).

The `saveUsername` and `loadPreviousUsername` functions handle saving and loading the previously entered username using the browser's localStorage API.

## Dependencies

This project has no external dependencies.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
