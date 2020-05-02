def info(message) {
    echo "INFO: ${message}"
    echo helperVar()
    echo env.COMPUTERNAME
}

def warning(message) {
    echo "WARNING: ${message}"
    echo env.DEBUG_BUILD
    if (env.DEBUG_BUILD) {
        echo "it is working"
    } else {
        echo "work anyways"
    }
    
    if (env.CHOICES == "one") {
        echo "this is one"
    } else {
        echo "not sure"
    }
}
