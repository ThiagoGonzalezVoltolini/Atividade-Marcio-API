# Atividade Marcio API

## Project Overview
This project is an API integration that utilizes the [Agify.io](https://agify.io/) service to predict a person's age based on their name. The system fetches data from the Agify API and presents it to users in a simple and understandable format.

## How to Run the Project
To run the project, follow these steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/ThiagoGonzalezVoltolini/Atividade-Marcio-API.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Atividade-Marcio-API
   ```
3. Install the required dependencies:
   ```bash
   npm install
   ```
4. Start the server:
   ```bash
   npm start
   ```
5. Access the API at `http://localhost:3000/api/age?name=<your_name>`

## API Used
The project utilizes the [Agify.io](https://agify.io/) API to predict age based on a name input. 

## Information Displayed
When a name is provided as input, the API returns:
- The provided name
- The predicted age as estimated by the Agify API
- The count of how many people with that name were used to calculate the average age

Feel free to explore and test the API with different names!