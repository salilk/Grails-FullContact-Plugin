#Grails FullContact Plugin

A Groovy Grails wrapper for the [FullContact API](http://api.fullcontact.com/)

##How to use ?

* You can directly download the plugin source code and use it. But the best and easiest way to use is it install the
 grails plugin

        grails install-plugin full-contact;

* Declare an instance of FullContact in your grails controller/service

        def fullContact


* Finding a person information

		def entity = fullContact.getPersonInformation("lorangb@gmail.com");


* Status Code of the Request

        println "Status Code : ${entity.statusCode}\n"


* Getting the Contact Info

        def contactInfo = entity.contactInfo;
 		println "Full name : ${contactInfo.fullName}";
 		println "Given name : ${contactInfo.givenName}, Family name : ${contactInfo.familyName}\n";


* List of Chat Clients & Handles

         List chats = contactInfo.chats;
         chats.each{chat ->
 			println """Client : ${chat.chatClient},
             Handle: ${chat.chatHandle}\n""";
         }


* List of Phone Numbers

         def phoneNumbers = contactInfo.phoneNumbers;
         println """Phone Numbers:
                 $phoneNumbers\n"""


* List of Organizations

         def organizations = entity.getOrganizations();
         organizations.each{org ->
             println """company: ${org.organizationName},
             Title: ${org.organizationTitle}, startDate: ${org.organizationStartDate}\n"""
         }


* List of Photos (e.g. Flickr, Picassa, etc)

         def photos = entity.photos;
         photos.each{photo ->
             println """Image Type: ${photo.photoType},
             URL: ${photo.photoUrl}\n"""
         }


* List of Social Profiles (e.g. Facebook, Twitter, etc)

        def profiles = entity.getSocialProfiles();
 		profiles.each{profile ->
             println """Profile Type: ${profile.profileType},
             id: ${profile.profileId},
             URL: ${profile.profileUrl},
             Username: ${profile.profileUsername},
             BIO: ${profile.bio},
             connections: ${profile.connections},
             status: ${profile.currentStatus},
             currentStatusTimestamp : ${profile.currentStatusTimestamp}\n"""
        }

