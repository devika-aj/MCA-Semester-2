# **Experiment No: 1**
## **Familiarise with Linux Commands**

#### 1. Command to display the following message as such (Use ” and Newline).
####    "Hi Everyone..
####    We are starting Shell Scripting"

```bash
echo -e "Hi Everyone..\nWe are starting Shell Scripting"
```

#### 2. Read your name from the keyboard and display it.

```bash
echo "Enter your name:"
read name
echo "Your name is: $name"
```

#### 3. Create the directory structure dir1/dir4 and dir1/dir2/dir3 with a single command and then change directory to dir3

```bash
mkdir -p dir1/dir4 dir1/dir2/dir3 && cd dir1/dir2/dir3
```

#### 4. Create a file testfile1 using nano.
####    Display the file
####        (i) starting with the first 10 lines and
####        (ii) starting with the 10th line with provision for
####            a) Scrolling Up
####            b) Scrolling Up and Down

```bash
# Create testfile1 
nano testfile1

# i)
head testfile1

# a) Scrolling Up
tail -n +10 testfile1

# b) Scrolling Up and Down
tail -n +10 testfile1 | less

```

#### 5. Get the manual page of ’ls’ command. Search for the word ”alphabetic”. Find the next occurrence and then find the previous occurrence.

```bash
man ls | grep "alphabetic"
```

#### 6. Create 2 files testfile2 and testfile3 using nano.
#### (a) Modify the permissions of testfile2 using symbolic mode
####        i. Add read permission to others
####        ii. revoke write from owner
####        iii. set only execute to Group.
####        iv. add write to owner, revoke read from others and set read onlyto group.
####        v. set read and write to all
#### (b) Modify the permissions of testfile3 using numeric mode
####        i. Set read and write to all
####        ii. set read,write and execute to owner, read and execute to group and read only to others
#### (c) Set the permissions of testfile2 the same as that of testfile3
#### (d) Set the permissions of the tree (the directory, its children , grand children, etc.) rooted at dir1 (Qn. 3) directory to 664


```bash
nano testfile2
nano testfile3

# Modify the permissions of testfile2 using symbolic mode
chmod o+r testfile2
chmod u-w testfile2
chmod g+x testfile2
chmod u+w,go-r testfile2
chmod a+rw testfile2

# Modify permissions of testfile3 using numeric mode
chmod 666 testfile3
chmod 711 testfile3

# Set permissions of testfile2 same as testfile3
chmod --reference=testfile3 testfile2

# Set the permissions of the tree rooted at dir1 to 664
chmod -R 664 dir1
```

#### 7. Change the owner and group of the directory tree from dir2 to student.
```bash
chown -R student:student dir2
```

#### 8. Display Current Directory

```bash
pwd
```

#### 9. List Files and Folders
#### (a) List the contents of dir1 (Qn. 3) and all its descendants
#### (b) List the contents of dir3 (Qn. 3) in
####        1. Alphabetical Order
####        2.Sorted on Time of modification, newest first
####        3.Sorted on Size
####        4.Reverse of all above
####        5.Long listing of files Sorted on Size with smallest first and size
####        6.displayed in human readable form
```bash
# (a) 
ls -R dir1

# (b)
# Alphabetical Order
ls -l dir3 | sort
# Sorted on Time of modification, newest first
ls -lt dir3
# Sorted on Size
ls -lS dir3
# Reverse of above
ls -lSr dir3
# Long listing of files Sorted on Size with smallest first
ls -lhS dir3
# Display in human-readable form
ls -lh --sort=size dir3
```

#### 10. (a) Execute ls and store the output to a file lsoutput
####     (b) Execute ls -l and add the output to lsoutput, at the end.

```bash
#  a)
ls > lsoutput

#  b)
ls -l >> lsoutput
```

#### 11. Execute ls -l and feed the result to less command, to scroll through the directory listing.
```bash
ls -l | less
```

#### 12. (a) Create a file file1 containing the word ”Hello,” using cat and output redirection
#### (b) Create another file file2 containing the word ”, Greetings!!”
#### (c) Display the sentence,
####    Hello,
####    yourname
####    , Greetings!!
#### using cat, by concatenating file1, Standard Input and file2

```bash
# (a)
cat > file1 # write contents

# (b) 
cat > file2 # write contents

# (c) 
cat file1 file2
```

#### 13. Copy the file file1 to newfile.
#### (a) If newfile already exists, it should be replaced.
#### (b) If newfile already exists, it should not be replaced.
#### (c) If newfile already exists, it should be replaced, but only with the consent of the user.
#### (d) If newfile already exists, it should be replaced only if its contents is older than that of newfile.
#### (e) Even if newfile is read only.
#### (f) Create a link instead of copying.
#### (g) Copy the entire directory tree from dir1 of Cycle 1 to a new directory dir5

```bash
# (a) 
cp -f file1 newfile

# (b) 
cp -n file1 newfile

# (c) 
cp -i file1 newfile

# (d) 
cp -u file1 newfile

# (e) 
cp -f file1 newfile --reply=yes

# (f) 
ln file1 newfile

# (g) 
cp -r dir1 dir5
```

#### 14. Create a new directory, dir6 inside dir1
####    (a) Move all files in dir5 into it.
####    (b) Rename the file newfile in Qn.4 to oldfile
####    (c) Move the file file1 in Qn.4 to dir6 with the name file3
####    (d) Delete all files where name starts with a vowel character,upper or lower case.
####    (e) Delete all files where the name is at least 3 characters long.
####    (f) Delete all hidden folders, and files.

```bash
# Create a new directory dir6 inside dir1
cd dir1
mkdir dir6

# (a) 
mv dir5/* dir6/

# (b) 
mv newfile oldfile

# (c)
mv file1 dir6/file3

# (d)
rm [aeiouAEIOU]*

# (e) 
find . -type f -name '???*' -delete

# (f) 
rm -rf .*
```

#### 15. Using cut filter
####    (a) Display the filenames from ls -l assuming filenames start at column 50.
####    (b) Display user Id and user name of all users from /etc/passwd. (fields 1 and 3)

```bash
# (a) 
ls -l | cut -c50-

# (b)
cut -d: -f1,3 /etc/passwd
```

#### 16. Create 3 files containing name, age and marks of 5 students respectively and paste them into a single csv (comma separated values) file.

```bash
cat > name # write names of 5 students
cat > age # write age of 5 students
cat > marks # write marks of 5 students

paste -d',' file1 file2 file3 > combined.csv
```

#### 17.Using find
####    (a) piped with wc, display the number of files in a directory that starts with the letter a
####    (b) Delete all .c files in the parent directory
####    (c) Copy all files that starts with a to dir2
####    (d) Display files in the current directory that were modified in the last 30 minutes.

```bash
# (a) 
find . -type f -name 'a*' | wc -l

# (b)
find .. -type f -name '*.c' -delete

# (c)
find . -type f -name 'a*' -exec cp {} dir2 \;

# (d)
find . -mmin -30
```

#### 18.Use head and tail piped with cat /etc/passwd to display the details of
####    (a) The first 12 users in the system.
####    (b) The last 7 users in the system.
####    (c) All but the first 3.
####    (d) All but the last 5.
####    (e) Only the 9 th .

```bash
# (a) 
head /etc/passwd |head -12

# (b)
tail /etc/passwd |tail -7 

# (c)
tail /etc/passwd |tail +4 

# (d)
head /etc/passwd |head -n -5 

# (e)
head /etc/passwd |head -9|tail -1
```

#### 19. Use Grep
#### (a) Display all lines in a file that contains the string abc
#### (b) Display all lines in a file that does not contain the string abc
#### (c) List names of all .c files that contains a printf
#### (d) List names of all .c files that does not contain a printf
#### (e) Display the number of #include statements in each .c file.
#### (f) Display the Line numbers of printf in a .c file.
#### (g) List names of all files in the directory tree that contain a printf.
#### (h) Display the context of every printf in a .c file. i.e., n lines before and after every printf.
#### (i) ls -l starts with d for directories. Use ls -l piped with grep & cut to display the names of all directories in the current directory.

```bash
# (a)
grep 'abc' file.txt

# (b)
grep -v 'abc' file.txt

# (c)
grep -rl 'printf' *.c

# (d)
grep -rL 'printf' *.c

# (e)
grep -c '#include' *.c

# (f)
grep -n 'printf' file.c

# (g)
grep -rl 'printf' dir1/

# (h)
grep -C 5 'printf' file.c

# (i)
ls -l | grep '^d'
```
#### 20. Using Expr 
#### (a) Read two integers X and Y . Display the sum, difference, product, quotient and remainder of these variables.
#### (b) Read a string, S, a position, p and a length l. Display the substring of length l starting at position p from the string S

```bash
# (a)
echo "Enter X and Y:"
read X Y
echo "Sum: $(expr $X + $Y)"
echo "Difference: $(expr $X - $Y)"
echo "Product: $(expr $X \* $Y)"
echo "Quotient: $(expr $X / $Y)"
echo "Remainder: $(expr $X % $Y)"

# (b)
echo "Enter string S:"
read S
echo "Enter position p:"
read p
echo "Enter length l:"
read l
echo "Substring: $(expr substr "$S" $p $l)"
```
