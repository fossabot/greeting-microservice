package de.debuglevel.greeter

import io.micronaut.context.annotation.Property
import io.micronaut.security.authentication.*
import io.reactivex.Flowable
import org.reactivestreams.Publisher
import java.util.*
import javax.inject.Singleton

/**
 * Example for an AuthenticationProvider, which just checks for a single configured credential
 */
@Singleton
class SingleUserPasswordAuthenticationProvider(
    @Property(name = "app.security.single-user-password-authentication.credentials.username") val username: String,
    @Property(name = "app.security.single-user-password-authentication.credentials.password") val password: String
) : AuthenticationProvider {
    override fun authenticate(authenticationRequest: AuthenticationRequest<*, *>): Publisher<AuthenticationResponse> {
        if (authenticationRequest.identity == username &&
            authenticationRequest.secret == password
        ) {
            return Flowable.just(UserDetails(username, ArrayList()))
        } else {
            return Flowable.just(AuthenticationFailed())
        }
    }
}