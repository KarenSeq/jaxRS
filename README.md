RESTful service using JAX-RS implementation
===========================================

About the project
-----------------
It is a simple REST project implemented using Jersey 1. It has a deployment descriptor(web.xml) with the jerey servlet so that requests are mapped.  
A service class CountryRestService and tow POJO classes Book and Country.  

How to connect a new project from local to git ?
------------------------------------------------
This project was also built on local and then committed. Steps to do the same.  
1. Create a new repository in your git account.
2. Go to your project folder in local and open git Bash.Type the following:
3. rd .git /S/Q   -- to remove all existing git files
4. git init --to initialize your project with git
5. git add . -- to add all your local files
6. git commit -m "some commit message" ---to commit files to local
7. git remote add origin <your git SSH URL> --to add files to git repo; SSH as HTTPS doesn't work. More info here - https://stackoverflow.com/questions/2702731/git-fails-when-pushing-commit-to-github
8. git push -u origin master --to push files to git repo  

Reference
---------
* https://www.softwarelab.it/2018/10/12/adding-an-existing-project-to-github-using-the-command-line/  
* https://github.com/KarenSeq/jaxRS  
* Reference for markdown file - https://en.wikipedia.org/wiki/Markdown
