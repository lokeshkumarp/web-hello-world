node {
  stage "Checkout"
  git 'https://github.com/lokeshkumarp/web-hello-world.git'

  stage "Clean"
  sh "./gradlew clean"

  stage "Test"
  sh "./gradlew test"

  stage "Package"
  sh "./gradlew assemble"

  stage "Publish Junit"
  junit '**/test-results/**/*.xml'

  stage "Archive"
  archiveArtifacts "build/libs/*.war"
}