package blog

class Entry {

    Long id
    
    Author author
    
    static hasMany = [
        comment : Comment
    ]
    
    Date publishDate
    
    //int day, month, year
    
    String title, text
    
    boolean published
    
    static constraints = {
        publishDate nullable:true
        
    }
    
//    static mapping = {
//        day formula: 'DAY(publishDate)'
//        month formula: 'MONTH(publishDate)'
//        year formula: 'YEAR(publishDate)'
//    }
}
