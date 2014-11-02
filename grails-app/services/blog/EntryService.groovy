package blog

class EntryService {

    def saveEntry(Entry entry) {
        entry.save()
    }
    
    def publishOrUnpublishEntry(boolean publish) {
        entry.published = publish
    }
    
    List<Entry> getEntriesByMonth(int y, int m, boolean filterPublishedEntries) {
        Entry.findAll
        {
            and
            {
                eq("year",y) 
                eq("month",m)
                if(filterPublishedEntries)
                eq("published", true)
            }
        }
    }
    
    List<Entry> getAuthorEntries(Author a, boolean filterPublishedEntries) {
        def entries= Entry.createCriteria().list{
            and{
                author
                {
                    eq("id",a.id)
                }
                if(filterPublishedEntries)
                eq("published", true)
            }
        }
    }
    
    List<Entry> getLastEntries(int startIndex, int count, boolean filterPublishedEntries) {
        
        Entry.findAll(
            [
                max:count, 
                offset:startIndex
            ]
        )
    }

    Entry getEntryById(int id) {
        return Entry.findById()
    }
    
    
    
    
}
