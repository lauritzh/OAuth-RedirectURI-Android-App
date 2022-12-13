# OAuth Redirect URI Test

![App Icon](oauth_test_app_icon.png)

A relatively common *OAuth* and *OpenID Connect* implementation flaw is to allow arbitrary schemes for the `redirect_uri` parameter within the [*Auth. 
Request*](https://datatracker.ietf.org/doc/html/rfc6749#section-4.1.1). This enables CSRF-style credential disclosure attacks using *custom URL schemes* for native applications.

This simple demo application registers the URL scheme `com.test.test://` and prompts received data on activation via *Intent*.

## Example:
1. Install Application (either from source or via the Play Store: https://play.google.com/store/apps/details?id=com.lauritz.oauthredirecturitest).
2. Click the following link: [com.test.test://example.com/callback?code=test#access_token=test2](com.test.test://example.com/callback?code=test#access_token=test2)
