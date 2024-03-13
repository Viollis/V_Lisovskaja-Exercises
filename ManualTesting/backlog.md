# Your backlog how should look Into Comments

**Story: User Registartion**

Use Case 1: User Registration

**Title:** User Registration

**Description:** This use case covers the process of user registration on the website.

**Actor:** Unregistered User

**User Stories:**

**User Registration**

**Title:** As an unregistered user, I want to be able to create a new account on the website.

**Description:** Unregistered users should be able to register with valid and complete information.

**Acceptance Criteria:**

- Provide a registration form with fields for First Name, Last Name, Address, City, State, Zip Code, Phone Number, Social Security Number (SSN), Email Address, Username, Password, and Confirm Password.
- Validate that First Name and Last Name consist only of letters and spaces.
- Validate that Address, City, State, and Zip Code are filled out correctly.
- Validate that Phone Number contains only numbers.
- Validate that SSN follows a valid format (e.g., XXX-XX-XXXX).
- Validate that Email Address is in a valid format (contains "@" and a domain) and unique (not already registered).
- Validate that Username contains only letters and numbers and does not include special symbols.
- Validate that Password meets the criteria: at least one capital letter, one small letter, one special symbol, one number, minimum 8 symbols, maximum 20 symbols.
- Ensure that the Confirm Password matches the Password.
- Allow successful registration after validation.

---

**Story: User Login**

Use Case 2: User Login

**Title:** User Login

**Description:** This use case covers the process of user login on the website.

**Actor:** Registered User

**User Stories:**

**User Login**

**Title:** As a registered user, I want to be able to log in to my account using my username and password.

**Description:** Registered users should be able to log in using their credentials.

**Acceptance Criteria:**

- Provide a login form with fields for Username and Password.
- The user enters their valid username and password.
- The system validates the user's input by checking that the username exists in the system and that the provided password matches the stored password for the corresponding username.
- If validation passes, the system logs the user into their account, granting access to personalized content and features.

**User Login - Incorrect Credentials**

**Title:** As a registered user, I want to see an error message when attempting to log in with incorrect credentials.

**Description:** The system should display an error message for incorrect login credentials.

**Acceptance Criteria:**

- Provide a login form with fields for Username and Password.
- The user enters an invalid username and password.
- The system validates the user's input and finds that the credentials do not match any registered user.
- Verify that the system displays an error message indicating that the login credentials are incorrect.

---

**Story: User Naviagtion**

Use Case 3: User Navigation

**Title:** User Navigation

**Description:** This user story encompasses the process of users navigating through the website's menu links to access relevant information and services.

**Actor:** User

**User Stories:**

**Accessing "Solutions" Page**

**Title:** As a user, I want to be able to access the "Solutions" page to view information about the company's solutions and services.

**Description:** Users should be able to access the "Solutions" page to learn about the company's offerings.

**Acceptance Criteria:**

- The "Solutions" menu link should be clickable.
- Clicking on the "Solutions" link should take the user to the "Solutions" page.
- The "Solutions" page should display information about the company's solutions and services.

**Accessing "About Us" Page**

**Title:** As a user, I want to be able to access the "About Us" page to learn more about the company or organization.

**Description:** Users should be able to access the "About Us" page to get information about the company's history, mission, and values.

**Acceptance Criteria:**

- The "About Us" menu link should be clickable.
- Clicking on the "About Us" link should take the user to the "About Us" page.
- The "About Us" page should provide relevant information about the company or organization.

**Accessing "Services" Page**

**Title:** As a user, I want to be able to access the "Services" page to explore the services offered by the company.

**Description:** Users should be able to access the "Services" page to learn about the various services provided by the company.

**Acceptance Criteria:**

- The "Services" menu link should be clickable.
- Clicking on the "Services" link should take the user to the "Services" page.
- The "Services" page should contain information about the services offered by the company.

**Accessing "Products" Page**

**Title:** As a user, I want to be able to access the "Products" page to explore the products offered by the company.

**Description:** Users should be able to access the "Products" page to learn about the different products available from the company.

**Acceptance Criteria:**

- The "Products" menu link should be clickable.
- Clicking on the "Products" link should take the user to the "Products" page.
- The "Products" page should provide information about the products offered by the company.

**Accessing "Locations" Page**

**Title:** As a user, I want to be able to access the "Locations" page to find information about the company's physical locations.

**Description:** Users should be able to access the "Locations" page to discover the physical addresses and contact information for the company's locations.

**Acceptance Criteria:**

- The "Locations" menu link should be clickable.
- Clicking on the "Locations" link should take the user to the "Locations" page.
- The "Locations" page should display information about the company's physical locations.

**Accessing "Admin Page" (if applicable)**

**Title:** As a user, I want to be able to access the "Admin Page" to perform administrative tasks if I have the necessary permissions.

**Description:** Users with appropriate permissions should be able to access the "Admin Page" to perform administrative tasks or access privileged content.

**Acceptance Criteria:**

- The "Admin Page" menu link should be clickable and visible only to users with the necessary permissions.
- Clicking on the "Admin Page" link should take authorized users to the "Admin Page."
- The "Admin Page" should provide access to administrative features or content based on the user's role and permissions.

---

**Story: Buttons Welcome to ParaBank**

Use Case 4: Navigating Using Buttons

**Actor:** User

**User Stories:**

**Home Button**

**Title:** Test "Home" Button

**Description:** As a website user, I want to click the "Home" button to navigate to the index.html page.

**Acceptance Criteria:**

- The user should be on a web page.
- Clicking the "Home" button should successfully redirect the user to the index.html page.

**About Us Button**

**Title:** Test "About Us" Button

**Description:** As a website user, I want to click the "About Us" button to navigate to the about.html page.

**Acceptance Criteria:**

- The user should be on a web page.
- Clicking the "About Us" button should successfully redirect the user to the about.html page.

**Contact Button**

**Title:** Test "Contact" Button

**Description:** As a website user, I want to click the "Contact" button to navigate to the contact.html page.

**Acceptance Criteria:**

- The user should be on a web page.
- Clicking the "Contact" button should successfully redirect the user to the contact.html page.

---

**Story: Open new Account when Register**

Use Case 5: Opening a New Account

**Title:** Opening a New Account

**Description:** This use case covers the process of a user opening a new account within the banking application or website.

**Actor:** User

**User Stories:**

**Opening a New Account**

**Title:** As a user, I want to be able to open a new account through the banking application or website.

**Description:** Users should be able to initiate the process of opening a new account with the bank.

**Acceptance Criteria:**

- Provide a link or button labeled "Open New Account" on the main dashboard.
- Clicking the "Open New Account" link/button should lead the user to a page/form where they can select the account type they want to open.
- The user should have the option to choose between "CHECKING" and "SAVINGS" account types.
- The system should display a message clearly indicating that a minimum deposit of $100.00 is required at the time of opening an account.
- Provide a dropdown selector with an option labeled "13677."
- The user should be able to select the "13677" option from the dropdown.
- The form should include a button labeled "Open New Account" to initiate the account opening process.
- If the user clicks the "Open New Account" button, the system should create a new account of the selected type.
- The user should receive confirmation of the new account creation or any additional instructions if needed.

---

**Story: Accounts Overview when you register**

Use Case 6: Accessing Account Activity

**Title:** Accessing Account Activity

**Description:** This use case covers the process of a user accessing their account activity on the banking application or website.

**Actor:** User

**User Stories:**

**Accessing Account Activity**

**Title:** As a user, I want to be able to access my account activity by clicking on my account number and specifying search criteria.

**Description:** Users should be able to view their transaction history by accessing the account activity page and applying specific search criteria.

**Acceptance Criteria:**

- Provide a list of the user's accounts on the account overview page, including information such as Account number, Balance, and Available Amount.
- The user should be able to click on the "Account number" or the corresponding line for a specific account to access its activity.
- Upon clicking, the user should be redirected to the "Account Activity" page.
- On the "Account Activity" page, provide a selector for "Activity Period," allowing the user to choose a specific month or date range for the transactions.
- Include a selector for "Type," enabling the user to filter transactions by type (e.g., "Debit" or "Card").
- After selecting the desired "Activity Period" and "Type," a button should initiate the search for account activity based on the selected criteria.
- The user should be presented with the results of their search, displaying transactions that match the selected criteria.

--- 

**Story: Transfer Funds when you register**

Use Case 7: Funds Transfer

**Title:** Funds Transfer

**Description:** This use case covers the process of a user transferring funds from one account to another using the banking application or website.

**Actor:** User

**User Stories:**

**Funds Transfer**

**Title:** As a user, I want to be able to transfer funds from one account to another to effectively manage my finances.

**Description:** Users should be able to initiate fund transfers between their accounts for financial management.

**Acceptance Criteria:**

- Provide a "Transfer Funds" link or button on the main dashboard or a designated page.
- Clicking on the "Transfer Funds" link or button should navigate the user to a funds transfer page where the current balance is displayed in dollars.
- The "From account #" input field should be pre-filled with the default value "13677" (assuming this is the source account).
- The user should be able to input the destination account number in the "To account #" field.
- Include a "Transfer" button, which, when clicked, initiates the transfer of funds from the source account to the destination account.
- Upon a successful fund transfer, the user should receive confirmation and see updated balances for both accounts.

---

**Story: Bill Pay when you register**

Use Case 8: Making a Payment or Funds Transfer

**Title:** Making a Payment or Funds Transfer

**Description:** This use case covers the process of a user making a payment or transferring funds to a payee using the banking application or website.

**Actor:** User

**User Stories:**

**Making a Payment or Funds Transfer**

**Title:** As a user, I want to be able to make a payment or transfer funds to a payee to complete a financial transaction.

**Description:** Users should have the capability to initiate payments or fund transfers to payees through the banking application for financial transactions.

**Acceptance Criteria:**

- The user should be able to enter payee information, including Payee Name, Address, City, State, Zip Code, and Phone #, without encountering errors.

- The "Account #" and "Verify Account #" fields should match to ensure the accuracy of the destination account.

- The user should be able to specify the payment amount in the "Amount ($)" field.

- The "From account #" selector should allow the user to choose one of their accounts (e.g., "13566") as the source account for the payment or transfer.

- Initiating the payment or transfer by clicking the button should deduct the specified amount from the selected source account and credit it to the destination account.

- The user should receive confirmation of the successful payment or transfer and see updated balances for both the source and destination accounts.

---

**Story: Find Transactions when you you register**

Use Case 9: Searching for Transactions

**Title:** Searching for Transactions

**Description:** This use case covers the process of a user searching for transactions on their account using various criteria, such as account number, transaction ID, and date range, within the banking application or website.

**Actor:** User

**User Stories:**

**Searching for Transactions**

**Title:** As a user, I want to be able to search for transactions on my account using criteria like account number, transaction ID, and date range, to effectively review my transaction history.

**Description:** Users should have the capability to search for and review their transaction history based on specific criteria within the banking application.

**Acceptance Criteria:**

- The user should be able to enter the account number and transaction ID (if applicable) without encountering any errors.

- Clicking the "Find transaction" button should initiate a search for transactions based on the specified criteria and display the search results, including relevant transaction details.

- If the user chooses to search by a single date using the "Find by Date" button, it should provide relevant results for that specific date.

- If the user chooses to search within a date range using the "Find by Date Range" button, it should provide relevant results for transactions within the specified date range.

- The results of the transaction search should be presented clearly to the user, showing relevant transaction details for review.

- The user should have the option to refine their search criteria and conduct subsequent searches as needed for effective review of their transaction history.




