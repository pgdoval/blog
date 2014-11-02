
import blog.Author

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    Long id
    
    
    String name, userName, password, twitter
    Date registerDate

Author a = new Author([
        id:1,
        name:"Pablo",
        userName:"pgdoval",
        password:"pgdoval",
        registerDate: new Date(),
        surnames:"González Doval", 
        description:"Cómo molo"
])

 if (!a.save()) { a.errors.each { println it } }