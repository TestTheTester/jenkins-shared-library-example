def info(message) {
    echo "INFO: ${message}"
    echo helperVar()
    echo env.COMPUTERNAME
}

def warning(message) {
    echo "WARNING: ${message}"
}
