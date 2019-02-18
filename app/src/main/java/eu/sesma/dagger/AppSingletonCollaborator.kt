package eu.sesma.dagger

class AppSingletonCollaborator : IAppSingletonCollaborator{
    override fun getMessage() = "AppSingletonCollaborator production mode"
}
