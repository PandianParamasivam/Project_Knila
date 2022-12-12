Feature: Admin going to be fill the detail

Scenario: User given a personal details

Given admin launch the url
When admin enter the their user name
And  admin enter  the their password
And admin click the location
And admin click the login button
And admin registering the patient details
And admin enter the patient name
And admin enter the patient family name
And admin select the gender
And admin click the male
And admin click the patient birthdate
And admin enter the birth day
And admin select the birth month
And admin enter the birth year
And admin click the address info
And admin enter the patient street address
And admin enter the patient area address
And admin enter the patient city
And admin enter the patient state
And admin enter the patient country
And admin enter the patient postal code
And admin click the phone info
And admin enter the phone no
And admin click the confirm button
And admin click the confirm button again
Then admin navigate to the next page

Scenario: Admin going to be start the visit

When admin start the visit
And admin click the confirm right button
Then admin navigate to the third page

Scenario: Admin uploading necessary details

When admin click the attachments
And admin click the drop file
Then admin navigate to the fourth page

Scenario: Admin deleting the account

When admin naming the file
And admin click the upload button
And admin end the visit
And admin click the yes button
And admin click the delete account
And admin giving the reason
And admin click the final confirm button