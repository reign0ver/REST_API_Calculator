# REST_API_Calculator
Here we have an example of an REST API in Java.  Using Jersey as an implementation of JAX-RS and Jetty as a HTTP web server.

The calculador has the basic operations addition, subtraction, multiplication and division.

We also use the 'Facade Design Pattern' and 'Mediator Design Pattern'.  Yes, we use both of them, but how? Well, i'm gonna explain it to you because this is a weird mix.

First of all I'm going to show how the flow in this mix of patterns:

*The entry point of the app is the Facade
*Then, Facade calls the Mediator (we can have several Mediators and each of them can be grouped by a specific funcionality)
*The Mediator does whatever he has to do, and add to the DataBase

Well, once we get how the flow works I'm going to dive deeper.

As you can see (if you check the code), Facade only has an instance of Mediator and all his methods just return a call to their respective methods in the Mediator, so we can say that Mediator is a kind of controller that has all the application logic.  A little confusing, yeah, but if you check the code you'll understand better.

Let's see an example.  We have a calculator view, and we are going to add two numbers, for example 2 plus 2.  The REST service is going to call the EntryPoint and this is the Facade, then Facade calls the Mediator and this do the operation called, in this case, addition.  Inside of the Mediator method, we do another things, like call the class DAO, which is another design pattern and do his respective database insertion.

The DAO classes have the CRUD necesarry to insert, delete or update the operations from de database.

And this is an example of how design patterns help us to make our code better, Facade provides us with a unified and simple class to access a more complex system.

So how this works (in case you want to prove it):

*We are going to send from our frontend a request with JSON by POST with the next structure->

{
"numero1":"5",
"numero2":"3"
}

*and we're going to get a JSON response with the next structure->

{
"resultado": "2"
}

*Here you are the endpoints (port:8081)->

http://localhost:8085/api/sumar/decimal
http://localhost:8085/api/restar/decimal
http://localhost:8085/api/sumar/binario
http://localhost:8085/api/restar/binario

You can test it with Postman!

Hope you guys like it and help me to improve the code.  Thanks!
