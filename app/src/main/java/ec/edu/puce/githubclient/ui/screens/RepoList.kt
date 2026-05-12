package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ec.edu.puce.githubclient.ui.components.RepoItem



@Composable
fun RepoList() {
    Column {
        RepoItem(
            name = "Repositorio Django",
            description = "Proyecto de Pthon de Steven",
            avatarImg = "htpps://avatars.githubusercontent.com/u/48026030?y=4",
            language = "Python"
        )
        RepoItem(
            name = "Repositorio Android",
            description = "Proyecto de Pthon de Steven",
            avatarImg = "htpps://avatars.githubuser",
            language = "Kotlin"
        )
        RepoItem(
            name = "Repositorio Django",
            description = "Proyecto de Pthon de Steven",
            avatarImg = "htpps://avatars.githubusercontent.com/u/48026030?y=4",
            language = "Python"
        )
        RepoItem(
            name = "Repositorio iOS",
            description = "Proyecto de Pthon de Steven",
            avatarImg = "htpps://avatars.githubusercontent.com/u/48026030?y=4",
            language = "Python"
        )
        RepoItem(
            name = "Repositorio Language",
            description = "Proyecto de Pthon de Steven",
            avatarImg = "htpps://avatars.githubusercontent.com/u/48026030?y=4",
            language = "Python"
        )
    }
}

@Preview (showBackground = true)
@Composable
fun RepoListPreview(){
    RepoList()
}
