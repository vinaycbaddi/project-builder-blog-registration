![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | BLOG - User Registration

## A Quick Introduction

Inspired by Wattpad, Mr. Alex is on a mission to build "CODE WALL" - A community for developers. He has laid out a plan & hired a designer & developer to work on the project. Unfortunately, due to some trust issues, he had to fire them. He is suspicious that one of his competitors is trying to steal his idea & work on it quickly even before him. 

This is Alex's dream project. Well, now it's ours too. We assured him that you'd help out your best to finish this on time. So, could you hurry up & get going?

## What should you do
```
Fork this repo
Clone this repo
Practice Java basics - operators, conditions, loops, class and object
```

## How To Submit
```
Upon completion, run the following commands:

git add .
git commit -m "ProGrad ID"
git push origin master

And finally, create a pull request so your ProGrad Mentor (PM) can review your work.
```

## Instructions

1. ***Do not modify the entire code.***
2. ***Edit the code as per the instructions.***
3. ***Go to Java Resources -> src folder.***
4. ***You will have 3 packages src/controller, src/model and src/businesslogic.***
5. ***Create Classes inside the model package***
6. ***Once the progressions are completed, follow the instructions to run the application and test your code.***
 
## Run the Project
1. ***Right click on the project.***
2. ***Go to Run as -> Run on server.***
3. ***You can check the output in eclipse browser or in your browser.***

## Input Format
1. ***There are 3 inputs***
2. ***First input is a String which corresponds to email.***
3. ***Second input is a String which corresponds to password.***
4. ***Third input is a String which corresponds to confirm password.***

## Output Format
1. ***Output is a boolean value which returns true or false based on registration***

## Progression - 1 
1. ***Create a class called User inside the model package with the following arguments***
   - **String email**
   - **String password**
   - **LocalDateTime date**
2. ***Generate appropriate getters and setters.***
3. ***Generate a 3 argument constructor in the User class.***

## Progression - 2
1. ***Create a class called RegistrationValidation with the following methods***
   - ***public boolean checkUserDetails(String email, String password, String confirmPassword)*** 
   - ***private boolean validPassword(String password, String confirmPassword)***
   - ***private boolean validEmail(String email)***
2. ***CheckUserDetails should invoke two methods validPassword and validEmail.***
3. ***Email should pass the following validations***
   - ***Email can contain alphanumeric value***
   - ***Allowed special characters - _, @, .[at, underscore, dot]***
   - ***Email should not be empty.***
4. ***Password should pass the following constraints***
   - ***Password field should not be empty.***
   - ***Password and confirm password should match.***
   - ***Must contain atleast 8 characters and atmost 20 characters.***
   - ***Must have atleast one uppercase letter, 1 lowercase letter and 1 number.***

## Progression - 3
1. ***Create an object for RegistrationValidation in the SignUpController class located inside JAVA Resources - src/controller***
2. ***Call the checkUserDetails method with the object created***

## Bonus Challenge
1. ***Write the validation code without using regex.***

Happy Coding ProGrad ❤️

