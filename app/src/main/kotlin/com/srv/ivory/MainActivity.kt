package com.srv.ivory
import com.github.javiersantos.piracychecker.PiracyChecker
import dev.jahir.blueprint.BuildConfig
import dev.jahir.blueprint.ui.activities.BottomNavigationBlueprintActivity

/**
 * You can choose between:
 * - DrawerBlueprintActivity
 * - BottomNavigationBlueprintActivity
 */
class MainActivity : BottomNavigationBlueprintActivity() {

    /**
     * These things here have the default values. You can delete the ones you don't want to change
     * and/or modify the ones you want to.
     */
    override val billingEnabled = true

    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = false
    override fun checkStores(): Boolean = false
    override val isDebug: Boolean = BuildConfig.DEBUG

    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiEzh57HS169E7iOMCFSXZX7udW5/37IgYiY4OBturv7d/m4KJ6ihwjxf4aokKgc3lLduVTL3qwE571t12tY/aNwwvwAaE3DOokTxjtA8EZWEF6qi2XqAXz9EgK/If2OM9o3jS6J5daCYnReuIlZvU/AwhiyPRHkN2LPERtOhkT5aTwXjA64sdzurMZx9CRKBaGTFOWzadn7UACAoWjbMyznGbzyGEuEtOGAoDZIG3aJCbtFL5lphd8BTWUb8lZ/JPqTpKDopr7xrQlkDslwWI9jjWZgg76LT/zPQyKu2senH7APv2aU3hABL/96SllJ8T+lj5hb4N9WPZX7D9OVcBQIDAQAB"

    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        destroyChecker() // Important
        return null
    }

    override fun defaultTheme(): Int = R.style.MyApp_Default
    override fun amoledTheme(): Int = R.style.MyApp_Default_Amoled
}