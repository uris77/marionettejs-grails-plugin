# marionettejs-grails-plugin
This plugin provides resources for Marionettejs.

To get started with Marionettejs go to http://marionettejs.com

## Marionettejs

```
Backbone.Marionette is a composite application library for Backbone.js 
that aims to simplify the construction of large scale JavaScript applications.

It is a collection of common design and implementation patterns found in the applications 
that we have been building with Backbone, and includes pieces inspired by composite application 
architectures, event-driven architectures, messaging architectures, and more.

```

### Requirements

This plugin requires backbonejs version 1.0. The current grails backbonejs plugin is < 1.0, so 
you might need to include the backbonejs file manually. There is currently a pull request with the
newest version of backbonejs. Once that is accepted, then both plugins will be compatible.

### Usage

To use marionettejs include the following in your GSP:

```groovy
<r:require module="marionettejs" />
```
