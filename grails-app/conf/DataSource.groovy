dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "pablo"
    password = "pablo"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            driverClassName = "org.postgresql.Driver"
            url = "jdbc:postgresql://localhost:5432/blog"
            //            url = "jdbc:postgresql://192.168.3.102:5432/yump"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            driverClassName = "org.postgresql.Driver"
            url = "jdbc:postgresql://localhost:5432/blog"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            driverClassName = "org.postgresql.Driver"
            url = "jdbc:postgresql://localhost:5432/blog"
            pooled = true
            properties {
                maxActive = -1
                minEvictableIdleTimeMillis=1800000
                timeBetweenEvictionRunsMillis=1800000
                numTestsPerEvictionRun=3
                testOnBorrow=true
                testWhileIdle=true
                testOnReturn=true
                validationQuery="SELECT 1"
            }
        }
    }
}
