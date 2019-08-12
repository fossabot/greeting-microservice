package de.debuglevel.greeting.rest

import io.micronaut.runtime.Micronaut

/**
 * Application entry point.
 *
 * Starts the Micronaut server
 *
 * @param args parameters from the command line call
 */
object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.run(Application.javaClass)

        // TODO: log the accessed URLs
        // TODO: status/info/health
        // TODO: start on configured port (probably already a Micronaut setting)
        // TODO: log application startup
        // TODO: how to do API versioning? (or do it at all?)
        // TODO: do configuration with some Micronaut provided stuff instead of natpryce.konfig?
        // TODO: prettier JSON output?
        // TODO: switch to other log backend?
        // TODO: create a README.md which is usable as a template
    }
}


