dataSource {
    pooled = true
    driverClassName = "org.hsqldb.jdbcDriver"
    username = "sa"
    password = ""
	dbCreate = "none" // one of 'create', 'create-drop','update'
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            url = "jdbc:hsqldb:mem:devDB"
        }
    }
    test {
        dataSource {
            url = "jdbc:hsqldb:mem:testDb"
        }
    }
    production {
        dataSource {
            url = "jdbc:hsqldb:file:prodDb;shutdown=true"
        }
    }
}
