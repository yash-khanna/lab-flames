![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | FLAMES

## A Quick Introduction

We all would have heard or in fact played the FLAMES game atleast once. Logically the game doesn't make a lot of sense, but it definitely is a lot of fun. And hence we thought, why not build it with the help of our ProGrads? 

(If you haven't heard of this game before, then quickly google it up & understand before you proceed)

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

1. ***Go through the instructions carefully.***
2. ***Do not modify the entire code.***
3. ***Edit the code as per the instructions.***
4. ***Go to Java Resources -> src folder.***
5. ***You will have two packages src/controller and src/service.***
6. ***You need to modify src/controller/FlamesCheck and src/service/FlamesCheckService.***
7. ***Once the progressions are completed follow the instructions to run the application and test your code.***
 
## Run the Project
1. ***Right - click on the project.***
2. ***Go to Run as -> Run on server.***
3. ***You can check the output in eclipse browser or in your browser.***

## Testing
1. ***Uncomment the code inside Java Resources - src -testing - TestPersonalityCalculator class file.***
2. ***Right - click on the project***
3. ***Go to Run as -> Junit Test.*** 
4. ***All the testcases must be evaluated.***

## Input Format
1. ***Input consist of 2 strings - name1 and name2***

## Output Format
1 ***Output is an integer that corresponds to the flames value***


## Progression - 1 
1. ***Open the class file FlamesCheckService inside JAVA Resources - src - service.***
2. ***Create a public class called FlamesCheckService.***

## Progression - 2
1. ***Create a public method called findYourBrainType of type String inside PersonalityCalculator.***
2. ***Your method takes String options as an input and returns a String as output as per the output format specified.***
3. ***Your method should invoke another method findAnswers to convert the options to an integer array.***
4. ***Calculate the braintype as per the formula given.***
5. ***Return the output as a string.***

## Progression - 3
1. ***Create a method called findAnswers of type int[] inside PersonalityCalculator.***
2. ***Your method takes String options as in input and returns an array of integers as output.***
3. ***The value of array corresponds to the answers to each questions.***
4. ***findAnswer method is invoked from findYourBrainType method.***
5. ***Return the integer array to findYourBrainType method.***

## Progression - 4
1. ***Create an object for PersonalityCalculator inside Java Resources - src - controller - PersonalityController.***
2. ***Call the findYourBrainType method with the object created.***
3. ***Pass the String options from the doPost method to the findYourBrainType method as argument.***
4. ***Create a String variable as message and Store the return value from findYourBrainType.***
5. ***Pass the message to request.setAttribute("message",message);***
6. ***There you go. You are ready to run your application and see which is your braintype.***

## Bonus Challenge
1. ***Print each answers in the console as per the format given below.***
2. ***Print the total score.***
3. ***Print the brain type in double quotes".***
```
The answer for question - 1 is 3.
Your total score is 54.
You are "left brained"
```
Happy Coding ProGrad ❤️
