import java.security.Provider
import java.security.Security

fun getProviders(): List<Provider> {
    val providers: Array<Provider> = Security.getProviders();
    return providers.asList();
}