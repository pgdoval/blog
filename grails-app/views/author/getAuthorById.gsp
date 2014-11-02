<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sample title</title>
    </head>
    <body>

        <h2>Hoooooooooolaaaaaa</h2>
        
        <g:form action="save" >
            <label for="name">name</label>
            <g:textField name="name" value="${author?author.name:''}"/>
            <br/>
            <label for="userName">userName</label>
            <g:textField name="userName" value="${author?author.userName:''}"/>
            <br/>
            <label for="password">password</label>
            <g:textField name="password" value="${author?author.password:''}"/>
            <br/>
            <label for="surnames">surnames</label>
            <g:textField name="surnames" value="${author?author.surnames:''}"/>
            <br/>
            <label for="description">description</label>
            <g:textField name="description" value="${author?author.description:''}"/>
            <br/>
            

            <g:submitButton name="create" value="Save" />
        </g:form>
    </body>
</html>
