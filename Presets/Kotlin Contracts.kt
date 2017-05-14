#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
#parse("File Header.java")
object ${Module_name}Contracts {

    interface View: BaseContracts.View {
        //TODO
    }

    interface Presenter: BaseContracts.Presenter {
        //TODO
    }

    interface Interactor: BaseContracts.Interactor {
        //TODO
    }

    interface InteractorOutput: BaseContracts.InteractorOutput {
        //TODO
    }

    interface Router: BaseContracts.Router {
        //TODO
    }

}
