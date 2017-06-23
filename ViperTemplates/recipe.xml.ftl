<?xml version="1.0"?>
<recipe>

    <#if generateContracts>
      <instantiate from="src/app_package/Kotlin Contracts.kt"
                    to="${escapeXmlAttribute(srcOut)}/${name}Contracts.kt" />
    </#if>


    <#if generateInteractor>
      <instantiate from="src/app_package/Kotlin Interactor.kt"
                  to="${escapeXmlAttribute(srcOut)}/${name}Interactor.kt" />
    </#if>


    <#if generatePresenter>
      <instantiate from="src/app_package/Kotlin Presenter.kt"
                  to="${escapeXmlAttribute(srcOut)}/${name}Presenter.kt" />
    </#if>

    <#if generateRouter>
      <instantiate from="src/app_package/Kotlin Router.kt"
                  to="${escapeXmlAttribute(srcOut)}/${name}Router.kt" />
    </#if>

    <#if viewType='custom'>
      <instantiate from="src/app_package/Kotlin CustomView View.kt"
                     to="${escapeXmlAttribute(srcOut)}/${name}View.kt" />
    </#if>

    <#if viewType='activity'>
      <instantiate from="src/app_package/Kotlin Activity View.kt"
                     to="${escapeXmlAttribute(srcOut)}/${name}Activity.kt" />
    </#if>

    <#if viewType='fragment'>
      <instantiate from="src/app_package/Kotlin Fragment View.kt"
                     to="${escapeXmlAttribute(srcOut)}/${name}Fragment.kt" />
    </#if>

    <open file="${srcOut}/${name}Contracts.kt"/>
</recipe>
