package ${packageName}

class ${name}Interactor(var output: ${name}Contracts.InteractorOutput?) : ${name}Contracts.Interactor {

    override fun unregister() {
        output = null
    }

    //region Interactor

    //TODO: Implement your Interactor methods here

    //endregion
}
