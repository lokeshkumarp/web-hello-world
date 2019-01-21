node {
  stage "Clean"
  sh "./gradlew clean"

  stage "Compile"
  sh "./gradlew compile"

  stage "Static Analysis"
  sh "./gradlew pmdMain"

  stage "Test"
  sh "./gradlew test"

  stage "Package"
  sh "./gradlew assemble"

  stage "Archive"
  archiveArtifacts "build/libs/*.war" 
}