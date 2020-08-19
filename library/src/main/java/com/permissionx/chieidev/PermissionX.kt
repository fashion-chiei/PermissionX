package com.permissionx.chieidev

import androidx.fragment.app.FragmentActivity

object PermissionX {
    private const val TAG = "PermissionX"

    fun request(
        activity: FragmentActivity,
        vararg permissions: String,
        callback: PermissionCallback
    ) {
        val fragmentManager = activity.supportFragmentManager
        val exitstedFragment = fragmentManager.findFragmentByTag(TAG)
        val fragment = if (exitstedFragment != null) {
            exitstedFragment as InvisibleFragment
        } else {
            val invisibleFragment = InvisibleFragment()
            fragmentManager.beginTransaction().add(invisibleFragment, TAG).commitNow()
            invisibleFragment
        }
        fragment.requestNow(callback, *permissions)
    }
}