grails.project.class.dir = "target/classes"

grails.project.dependency.resolution = {
    
    inherits("global") {        
    }
    log "warn" 
    legacyResolve false
    repositories {
        grailsCentral()
        
    }
    
    plugins {
        build(":release:2.2.0",
              ":rest-client-builder:1.0.3") {
            export = false
        }

        runtime ':resources:1.2.RC2'
        runtime ':underscore:1.4.4'
    }
}
