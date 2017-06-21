<?xml version="1.0"?>
<recipe>

    <instantiate from="src/app_package/Kotlin Contracts.kt"
                   to="${escapeXmlAttribute(srcOut)}/${name}Contracts.kt" />

    <instantiate from="src/app_package/Kotlin Interactor.kt"
                  to="${escapeXmlAttribute(srcOut)}/${name}Interactor.kt" />

    <instantiate from="src/app_package/Kotlin Presenter.kt"
                  to="${escapeXmlAttribute(srcOut)}/${name}Presenter.kt" />

    <instantiate from="src/app_package/Kotlin Router.kt"
                  to="${escapeXmlAttribute(srcOut)}/${name}Router.kt" />

    <#if generateCustomView>
      <instantiate from="src/app_package/Kotlin CustomView.kt"
                     to="${escapeXmlAttribute(srcOut)}/${name}CustomView.kt" />
    </#if>

    <#if generateActivity>
      <instantiate from="src/app_package/Kotlin Activity View.kt"
                     to="${escapeXmlAttribute(srcOut)}/${name}Activity.kt" />
    </#if>

    <#if generateFragment>
      <instantiate from="src/app_package/Kotlin Fragment View.kt"
                     to="${escapeXmlAttribute(srcOut)}/${name}Fragment.kt" />
    </#if>

    <open file="${srcOut}/${name}Contracts.kt"/>
</recipe>
