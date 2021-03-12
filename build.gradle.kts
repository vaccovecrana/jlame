plugins { id("io.vacco.oss") version "1.0.0" }

group = "io.vacco.jlame"
version = "3.100.2"

configure<io.vacco.oss.CbPluginProfileExtension> {
  addJ8Spec()
  addGoogleJavaFormat()
  addClasspathHell()
  sharedLibrary(true, false)
}
