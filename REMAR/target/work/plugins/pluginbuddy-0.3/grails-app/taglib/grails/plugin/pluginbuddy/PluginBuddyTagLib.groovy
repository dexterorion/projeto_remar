package grails.plugin.pluginbuddy

class PluginBuddyTagLib {
	static namespace = "enduser"
	static returnObjectForTags = ['verifyAppVersion']
	def pluginbuddyService
	
	def verifyAppVersion={attrs, body ->
		def gfolder=pluginbuddyService.returnAppVersion()
		out << gfolder
	}
	
	
}
