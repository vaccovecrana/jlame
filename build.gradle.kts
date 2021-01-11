plugins { id("io.vacco.common-build") version "0.5.3" }

group = "io.vacco.jlame"
version = "3.100.0"

configure<io.vacco.common.CbPluginProfileExtension> {
  addJ8Spec()
  addGoogleJavaFormat()
  addClasspathHell()
  setPublishingUrlTransform { repo -> "${repo.url}/${project.name}" }
  sharedLibrary()
}
