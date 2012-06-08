package licence
//@Grab(group = 'commons-io', module = 'commons-io', version = '2.0.1')

public void copyToEmr() {
    println "Copy licencation libs copyToEmr."

    def licDllDir = "n:/PrintNet T/Versions/LicDll"
    def version = "801006000"
    def targetDir = "c:/svn/mailprocessing8.2/mailprocessing_definitions/installation/odp_install/odp_install_server/licence/"

    copyFile(licDllDir + "/Win32/" + version + "/LicDll.dll", targetDir + "/check_windows_x86.dll")
    copyFile(licDllDir + "/Win64/" + version + "/LicDll.dll", targetDir + "/check_windows_amd64.dll")
    copyFile(licDllDir + "/Unixes/" + version + "/solaris_sparc32/libLic.so", targetDir + "/solaris_sparc/check_solaris_sparc")
    copyFile(licDllDir + "/Unixes/" + version + "/solaris_sparc32/libstlport.so.1", targetDir + "/solaris_sparc/libstlport.so.1")
    copyFile(licDllDir + "/Unixes/" + version + "/solaris_amd64/libLic.so", targetDir + "/solaris_amd64/check_solaris_amd64")
    copyFile(licDllDir + "/Unixes/" + version + "/solaris_amd64/libstlport.so.1", targetDir + "/solaris_amd64/libstlport.so.1")
    copyFile(licDllDir + "/Unixes/" + version + "/linux/libLic.so", targetDir + "/check_linux")
    copyFile(licDllDir + "/Unixes/" + version + "/linux64/libLic.so", targetDir + "/check_linux_amd64")
    copyFile(licDllDir + "/Unixes/" + version + "/aix32/libLic.so", targetDir + "/aix32/check_aix_ppc")
    copyFile(licDllDir + "/Unixes/" + version + "/aix32/libstdc++.a", targetDir + "/aix32/libstdc++.a")
    copyFile(licDllDir + "/Unixes/" + version + "/aix32/libgcc_s.a", targetDir + "/aix32/libgcc_s.a")
    copyFile(licDllDir + "/Unixes/" + version + "/aix64/libLic.so", targetDir + "/aix64/check_aix_ppc64")
    copyFile(licDllDir + "/Unixes/" + version + "/aix64/libstdc++.a", targetDir + "/aix64/libstdc++.a")
    copyFile(licDllDir + "/Unixes/" + version + "/aix64/libgcc_s.a", targetDir + "/aix64/libgcc_s.a")

    println "done"
    //Digesty pocita trida CheckSum v projektu connect_licence
}

private void copyFile(String from, String to) {
    println 'Copy "' + from + '" to "' + to + '"';
    def copyResult = new AntBuilder().copy(file: from, tofile: to);
    int i = 0;
}

copyToEmr()