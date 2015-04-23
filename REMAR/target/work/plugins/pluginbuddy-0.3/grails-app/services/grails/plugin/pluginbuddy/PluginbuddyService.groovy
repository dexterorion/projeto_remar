package grails.plugin.pluginbuddy



class PluginbuddyService {
	def grailsApplication
	
	 def returnAppVersion() {
		def gver=grailsApplication.metadata['app.grails.version']
		double verify=getGrailsVersion(gver)
		def gfolder
		if (verify >= 2.4 ) {
			gfolder="assets"
		}else{
			gfolder="resources"
		}
		return gfolder
	}
	
	// Returns users grails version
	def getGrailsVersion(String appVersion) {
		if (appVersion && appVersion.indexOf('.')>-1) {
			int lastPos=appVersion.indexOf(".", appVersion.indexOf(".") + 1)
			double verify=appVersion.substring(0,lastPos) as double
		}
	}

}
