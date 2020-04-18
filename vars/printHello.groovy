#!/usr/bin/env groovy

def call(Map config=[:]) {
    echo '${config.greet}, ${config.user}'
}
