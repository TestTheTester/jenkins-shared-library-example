def call() {
  script {
      parameters { choice(name: 'CHOICES', choices: ['one', 'two', 'three'], description: '') }
  }
}
