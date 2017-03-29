************************************************************************************** git status :-

Thor_@DESKTOP-BJ05UQ0 MINGW64 /e/Git/wpd2_lab1 (master)
$ git status
On branch master
Your branch is up-to-date with 'origin/master'.
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   .idea/misc.xml
        modified:   .idea/vcs.xml
        modified:   .idea/workspace.xml

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .idea/compiler.xml
        .idea/copyright/
        .idea/modules.xml
        README.txt

no changes added to commit (use "git add" and/or "git commit -a")

************************************************************************************** git add README.txt :-

Thor_@DESKTOP-BJ05UQ0 MINGW64 /e/Git/wpd2_lab1 (master)
$ git add README.txt

Thor_@DESKTOP-BJ05UQ0 MINGW64 /e/Git/wpd2_lab1 (master)
$ git status
On branch master
Your branch is up-to-date with 'origin/master'.
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

        new file:   README.txt

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   .idea/misc.xml
        modified:   .idea/vcs.xml
        modified:   .idea/workspace.xml

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .idea/compiler.xml
        .idea/copyright/
        .idea/modules.xml
************************************************************************************** git commit - m :- 
$ git commit -m "Readme git stages for milestone 1"
[master 0d1c64d] Readme git stages for milestone 1
 1 file changed, 1 insertion(+)
 create mode 100644 README.txt

$ git status
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   .idea/misc.xml
        modified:   .idea/vcs.xml
        modified:   .idea/workspace.xml

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .idea/compiler.xml
        .idea/copyright/
        .idea/modules.xml

no changes added to commit (use "git add" and/or "git commit -a")

************************************************************************************** git push origin master:-

Thor_@DESKTOP-BJ05UQ0 MINGW64 /e/Git/wpd2_lab1 (master)
$ git push origin master
Counting objects: 3, done.
Delta compression using up to 8 threads.
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 314 bytes | 0 bytes/s, done.
Total 3 (delta 1), reused 0 (delta 0)
To https://bitbucket.org/dpatte200/wpd2_lab1.git
   1d8dc96..0d1c64d  master -> master
