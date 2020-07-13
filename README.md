# Struts2-Vulnerable-App-

Example Struts2 application that is vulnerable to XSS and CSRF attacks, SQL Injections and more

### XSS vulnerability
* To exploit the XSS vulnerability, spin up the server using 
```
mvn jetty:run
```
* Go to [http://localhost:8080/maven-example/search](http://localhost:8080/maven-example/search) on your browser
* Enter your payload into the input field and submit!
