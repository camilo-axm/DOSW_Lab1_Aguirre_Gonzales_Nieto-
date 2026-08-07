# DOSW_Lab1_Aguirre_Gonzalez_Nieto-
Teamwork Agreements

-We will divide the work at the beginning of the lab's publication date, members of this       group will have a minimun of 5 hours before the lab submission deadline to complete their assigned part.

-If anyone has a question about another members work, feel free to ask.

-We will work equitably and collaboratively throughout the semester.

-Ther's no need to wworry about dates of submission as well be responsible for our part of     the lab.

-Finally we will enjoy this process and we are learn in every lab.


Meeting times

-As a group we decided to meet every Monday from 17:00 to 22:00 and on Wednesday in the same  time.


Communication channels

-Whatsapp and Teams


Frequency of our meetings

-Weekly


How would we resolv a conflict

-We would view the problem objectively and first, we discuss it among ourselves as a team members, attempting to find solution and after that if the conlict is hard we consulting to Profesor Laura would be the final step.




# Laboratory 1 – Git, GitHub and Functional Programming

## Team Members

- Camilo Aguirre
- Sara Sofia Gonzalez
- Juan David Nieto

# Challenge 1 — Welcome Message

## Evidence

### 1. Project Structure

![Project Structure](images/challenge1_structure.png)

### 2. Program Execution

![Program Execution](images/challenge1_execution.png)

### 3. Git Commit

![Git Commit](images/challenge1_git.png)


## Description

### What was implemented

A Java application was developed using functional programming concepts. A `Student` class was created to store each team member's information, while the `WelcomeMessage` class generates a welcome message using Java Streams, lambda expressions, `map()`, and `collect()`. Finally, the `Challenge1` class executes the application and displays the results.

### How the work was divided

it was implement Challenge 1, including the creation of the `Student`, `WelcomeMessage`, and `Challenge1` classes. The remaining team members were assigned to the other challenges of the laboratory.

### Which Git operations were used

The following Git commands were used during the development of this challenge:

- `git checkout`
- `git status`
- `git add`
- `git commit`
- `git push`

### Which conflicts appeared

A merge conflict occurred because the changes were initially made in the wrong feature branch after switching branches.

### How the conflicts were resolved

The conflict was resolved by restoring the correct files, removing the conflict markers (`<<<<<<<`, `=======`, `>>>>>>>`), verifying the code, and committing the corrected version to the appropriate branch.



## Challenge 2 — Parallel Commit Race

### Evidence
Conflicts
<img width="655" height="510" alt="WhatsApp Image 2026-08-06 at 9 40 21 AM" src="https://github.com/user-attachments/assets/861d8cc4-cf01-434c-b6dd-cdf0a81f2dc0" />

Results
<img width="651" height="301" alt="WhatsApp Image 2026-08-06 at 10 02 07 AM" src="https://github.com/user-attachments/assets/ade7c3e0-4542-4b42-8363-f6c4e5d8186b" />




### Description

During this challenge, we implemented several lambda-based methods to process lists of integers. The final program obtains the maximum value, minimum value, total number of elements, verifies whether the maximum value is divisible by 2, and checks whether the list size is odd or even. Finally, the methods were tested using two different lists in the `main` method.

The work was divided between both team members. One branch was responsible for implementing the maximum value function and the validations related to it, while the other branch implemented the minimum value function, the total number of elements, and the list size validation. After completing the individual tasks, both branches were merged into the main challenge branch.

The Git operations used during the challenge included:

- `git checkout`
- `git branch`
- `git add`
- `git commit`
- `git merge`
- `git stash`
- `git stash pop`
- `git log --oneline --graph --decorate --all`

Merge conflicts appeared because both branches modified the same Java file (`ParallelRace.java`) and added methods in similar sections of the code. The conflicts were resolved manually by reviewing both implementations, keeping the required methods from each branch, correcting method names and syntax errors, and ensuring that all functions worked together correctly before creating the final version.


# Challenge 6 — The Decision Machine

## Evidence


## Description

### What was implemented

A Java command execution system called **The Decision Machine** was implemented. The application executes different text commands using a `switch` statement and a `Map<String, Runnable>`, where each command is associated with a lambda expression. The final implementation supports the following commands:

- GREET
- FAREWELL
- SING
- DANCE
- JOKE
- SHOUT
- WHISPER
- ANALYZE

### How the work was divided

The project was developed collaboratively using two feature branches.

**Student A** implemented:

- GREET
- FAREWELL
- SING
- DANCE

**Student B** implemented:

- JOKE
- SHOUT
- WHISPER
- ANALYZE

After completing the assigned tasks, both implementations were merged into a single version of the project.

### Which Git operations were used

The following Git commands were used during the development process:

- `git branch`
- `git checkout`
- `git add`
- `git commit`
- `git push`
- `git pull`
- `git merge`
- `git fetch`
- `git log --oneline --graph --decorate --all`

### Which conflicts appeared

Merge conflicts occurred because both students modified the same source file while implementing different commands. Git was unable to automatically determine which changes should be kept during the merge process.

### How the conflicts were resolved

The conflicts were resolved manually by reviewing the conflicting sections and preserving the valid changes from both branches. Once the conflicts were resolved, the project was compiled and tested to verify that every command worked correctly. Finally, the merged version was committed and pushed to the remote repository.
