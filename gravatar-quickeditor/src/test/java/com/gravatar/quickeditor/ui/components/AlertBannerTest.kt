package com.gravatar.quickeditor.ui.components

import androidx.compose.ui.res.stringResource
import com.gravatar.quickeditor.R
import com.gravatar.quickeditor.ui.gravatarScreenshotTest
import com.gravatar.uitestutils.RoborazziTest
import org.junit.Test
import org.robolectric.annotation.Config

class AlertBannerTest : RoborazziTest() {
    @Test
    fun alertBannerLight() = gravatarScreenshotTest {
        AlertBanner(message = stringResource(id = R.string.gravatar_qe_alert_banner_no_avatar_selected), onClose = {})
    }

    @Test
    @Config(qualifiers = "+night")
    fun alertBannerDark() = gravatarScreenshotTest {
        AlertBanner(message = stringResource(id = R.string.gravatar_qe_alert_banner_no_avatar_selected), onClose = {})
    }
}
