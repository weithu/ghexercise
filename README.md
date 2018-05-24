**ghexercise**
    Remove Duplicates
     -----------------
     Please follow the below instructions exactly and carefully

     Deliverables:
      Write a working application that means all requirements.  You can write the application in
      Java OR JavaScript (you do NOT need to write in both languages).

      Email us both the source code and console output with results from running the application.

      The console output must be shown for running your application with the input
      “AbraCadABraAlakAzam”

      The console output from your application must exactly match the sample output provided
      below.

      Send us your work within 30 minutes.  It is better to submit what you have at 30 minutes,
      and then followup with better code later should you wish to do so.

     Requirements:
      Write an application that takes a single string as input.
      Write a function `removeDuplicates` that removes duplicate letters, case insensitively, so
      that every letter appears once and only once.
      Always keep the first occurrence of a letter, regardless of case.
      The function should only accept uppercase and lowercase letters.
      Your application should output the result of this function when called on the input string to
      the console.

      The application may not terminate due to exceptions or errors, including if we test the
      program with different inputs than the example provided.


     Example: the output from an input String of "AbraCadABraAlakAzam" is shown below.

     AbrCdlkzm
* export to jar
-----------------
`$ mvn clean compile assembly:single`
* run
-----------------
`$ java -jar ghexercise-1.0-SNAPSHOT-jar-with-dependencies.jar
  input: AbraCadABraAlakAzam
  output: AbrCdlkzm`