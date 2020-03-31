require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name         = package['name']
  s.version      = package['version']
  s.summary      = package['description']
  s.license      = package['license']

  s.authors      = package['author']
  s.homepage     = package['homepage']
  s.platform     = :ios, "9.0"


  s.source       = { :git => "https://github.com/bengele/react-native-emotion.git", :tag => "v#{s.version}" }
  s.public_header_files = "ios/**/*.{h}"
  s.source_files  = "ios/**/*.{h,m,swift}"
  
  s.resources = ['ios/emotions.plist', 'ios/emotions.bundle']


  s.requires_arc = true
  s.pod_target_xcconfig = { 'SWIFT_VERSION' => '5' }

  s.dependency 'React'
  s.dependency 'React-Core'

end