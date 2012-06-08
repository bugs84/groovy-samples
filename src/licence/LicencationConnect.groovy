package licence
//@Grab(group = 'commons-io', module = 'commons-io', version = '2.0.1')

public void copyToConnect() {
    println "Copy licencation libs copyToConnect."

    def licDllDir = "n:/PrintNet T/Versions/LicDll"
    def version = "801002000"
    def targetDir = "c:/svn/connect8.1/connect_definitions/installation/connect_install/licence/"

    copyFile(licDllDir + "/Win32/" + version + "/LicApp.exe", targetDir + "/check_windows_x86.exe")
    copyFile(licDllDir + "/Win64/" + version + "/LicApp.exe", targetDir + "/check_windows_amd64.exe")
    copyFile(licDllDir + "/Unixes/" + version + "/solaris_sparc32/LicApp", targetDir + "/check_solaris_sparc")
    copyFile(licDllDir + "/Unixes/" + version + "/solaris_amd64/LicApp", targetDir + "/check_solaris_amd64")
    copyFile(licDllDir + "/Unixes/" + version + "/linux/LicApp", targetDir + "/check_linux")
    copyFile(licDllDir + "/Unixes/" + version + "/aix32/LicApp", targetDir + "/check_aix_ppc")

    copyFile(licDllDir + "/Unixes/" + version + "/aix32/libgcc_s.a", targetDir + "/aix/libgcc_s.a")
    copyFile(licDllDir + "/Unixes/" + version + "/aix32/libLic.so", targetDir + "/aix/libLic.so")
    copyFile(licDllDir + "/Unixes/" + version + "/aix32/libstdc++.a", targetDir + "/aix/libstdc++.a")

    copyFile(licDllDir + "/Unixes/" + version + "/solaris_amd64/libLic.so", targetDir + "/solaris/amd64/libLic.so")
    copyFile(licDllDir + "/Unixes/" + version + "/solaris_amd64/libstlport.so.1", targetDir + "/solaris/amd64/libstlport.so.1")

    copyFile(licDllDir + "/Unixes/" + version + "/solaris_sparc32/libLic.so", targetDir + "/solaris/sparc/libLic.so")
    copyFile(licDllDir + "/Unixes/" + version + "/solaris_sparc32/libstlport.so.1", targetDir + "/solaris/sparc/libstlport.so.1")

    println "done"
    //Digesty pocita trida CheckSum v projektu connect_licence
}



private void copyFile(String from, String to) {
    println 'Copy "' + from + '" to "' + to + '"';
    new AntBuilder().copy(file: from, tofile: to);
}


copyToConnect()