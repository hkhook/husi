package io.nekohasekai.sagernet

const val CONNECTION_TEST_URL = "http://cp.cloudflare.com/"
const val SPEED_TEST_URL = "http://speed.cloudflare.com/__down?bytes=20000000"

object Key {

    const val DB_PUBLIC = "configuration.db"
    const val DB_PROFILE = "sager_net.db"

    const val GENERAL_SETTINGS = "generalSettings"
    const val ROUTE_SETTINGS = "routeSettings"
    const val PROTOCOL_SETTINGS = "protocolSettings"
    const val DNS_SETTINGS = "dnsSettings"
    const val INBOUND_SETTINGS = "inboundSettings"
    const val MISC_SETTINGS = "miscSettings"
    const val NTP_SETTINGS = "ntpSettings"

    const val PERSIST_ACROSS_REBOOT = "isAutoConnect"

    const val APP_EXPERT = "isExpert"
    const val APP_THEME = "appTheme"
    const val NIGHT_THEME = "nightTheme"
    const val SERVICE_MODE = "serviceMode"
    const val MODE_VPN = "vpn"
    const val MODE_PROXY = "proxy"
    const val MEMORY_LIMIT = "memoryLimit"

    const val REMOTE_DNS = "remoteDns"
    const val DIRECT_DNS = "directDns"
    const val EDNS_CLIENT_SUBNET = "ednsClientSubnet"
    const val ENABLE_DNS_ROUTING = "enableDnsRouting"
    const val ENABLE_FAKE_DNS = "enableFakeDns"

    const val IPV6_MODE = "ipv6Mode"

    const val PROXY_APPS = "proxyApps"
    const val BYPASS_MODE = "bypassMode"
    const val INDIVIDUAL = "individual"
    const val METERED_NETWORK = "meteredNetwork"

    const val TRAFFIC_SNIFFING = "trafficSniffing"
    const val RESOLVE_DESTINATION = "resolveDestination"

    const val BYPASS_LAN = "bypassLan"
    const val BYPASS_LAN_IN_CORE = "bypassLanInCore"
    const val INBOUND_USERNAME = "inboundUsername"
    const val INBOUND_PASSWORD = "inboundPassword"

    const val MIXED_PORT = "mixedPort"
    const val ALLOW_ACCESS = "allowAccess"
    const val SPEED_INTERVAL = "speedInterval"
    const val SHOW_DIRECT_SPEED = "showDirectSpeed"
    const val LOCAL_DNS_PORT = "portLocalDns"

    const val APPEND_HTTP_PROXY = "appendHttpProxy"

    const val CONNECTION_TEST_URL = "connectionTestURL"
    const val CONNECTION_TEST_CONCURRENT = "connectionTestConcurrent"
    const val CONNECTION_TEST_TIMEOUT = "connectionTestTimeout"

    const val SECURITY_ADVISORY = "securityAdvisory"
    const val TCP_KEEP_ALIVE_INTERVAL = "tcpKeepAliveInterval"
    const val RULES_PROVIDER = "rulesProvider"
    const val CUSTOM_RULE_PROVIDER = "customRuleProvider"
    const val LOG_LEVEL = "logLevel"
    const val LOG_BUF_SIZE = "logBufSize"
    const val MTU = "mtu"
    const val ALLOW_APPS_BYPASS_VPN = "allowAppsBypassVpn"
    const val ALWAYS_SHOW_ADDRESS = "alwaysShowAddress"
    const val BLURRED_ADDRESS = "blurredAddress"

    // NTP Settings
    const val ENABLE_NTP = "ntpEnable"
    const val NTP_SERVER = "ntpAddress"
    const val NTP_PORT = "ntpPort"
    const val NTP_INTERVAL = "ntpInterval"

    // Protocol Settings
    const val GLOBAL_ALLOW_INSECURE = "globalAllowInsecure"
    const val UPLOAD_SPEED = "uploadSpeed"
    const val DOWNLOAD_SPEED = "downloadSpeed"
    const val PROVIDER_HYSTERIA2 = "providerHysteria2"
    const val CUSTOM_PLUGIN_PREFIX = "customPluginPrefix"

    const val ACQUIRE_WAKE_LOCK = "acquireWakeLock"
    const val SHOW_BOTTOM_BAR = "showBottomBar"

    const val ALLOW_INSECURE_ON_REQUEST = "allowInsecureOnRequest"

    const val TUN_IMPLEMENTATION = "tunImplementation"
    const val PROFILE_TRAFFIC_STATISTICS = "profileTrafficStatistics"

    const val PROFILE_DIRTY = "profileDirty"
    const val PROFILE_ID = "profileId"
    const val PROFILE_NAME = "profileName"
    const val PROFILE_GROUP = "profileGroup"
    const val PROFILE_CURRENT = "profileCurrent"

    const val OVERRIDE_ADDRESS = "overrideAddress"
    const val OVERRIDE_PORT = "overridePort"

    const val SERVER_ADDRESS = "serverAddress"
    const val SERVER_PORT = "serverPort"
    const val SERVER_USERNAME = "serverUsername"
    const val SERVER_PASSWORD = "serverPassword"
    const val SERVER_METHOD = "serverMethod"
    const val SERVER_PASSWORD1 = "serverPassword1"

    const val PROTOCOL_VERSION = "protocolVersion"

    const val SERVER_PROTOCOL = "serverProtocol"
    const val SERVER_OBFS = "serverObfs"

    const val SERVER_NETWORK = "serverNetwork"
    const val SERVER_HOST = "serverHost"
    const val SERVER_PATH = "serverPath"
    const val SERVER_SNI = "serverSNI"
    const val SERVER_ENCRYPTION = "serverEncryption"
    const val SERVER_ALPN = "serverALPN"
    const val SERVER_CERTIFICATES = "serverCertificates"
    const val SERVER_PINNED_CERTIFICATE_CHAIN = "serverPinnedCertificateChain"
    const val SERVER_MTU = "serverMTU"

    const val SERVER_MUX = "serverMux"
    const val SERVER_BRUTAL = "serverBrutal"
    const val SERVER_MUX_TYPE = "serverMuxType"
    const val SERVER_MUX_STRATEGY = "serverMuxStrategy"
    const val SERVER_MUX_NUMBER = "serverMuxNumber"
    const val SERVER_MUX_PADDING = "serverMuxPadding"

    const val SERVER_VMESS_EXPERIMENTS_CATEGORY = "serverVMessExperimentsCategory"
    const val AUTHENTICATED_LENGTH = "authenticatedLength"

    const val SERVER_CONFIG = "serverConfig"
    const val SERVER_CUSTOM = "serverCustom"
    const val SERVER_CUSTOM_OUTBOUND = "serverCustomOutbound"

    const val SERVER_SECURITY_CATEGORY = "serverSecurityCategory"
    const val SERVER_TLS_CAMOUFLAGE_CATEGORY = "serverTlsCamouflageCategory"
    const val SERVER_ECH_CATEGORY = "serverEchCategory"
    const val SERVER_WS_CATEGORY = "serverWsCategory"
    const val SERVER_SS_CATEGORY = "serverSsCategory"
    const val SERVER_MUX_CATEGORY = "serverMuxCategory"
    const val SERVER_HEADERS = "serverHeaders"
    const val SERVER_ALLOW_INSECURE = "serverAllowInsecure"

    const val ECH = "ech"
    const val ECH_CFG = "echCfg"

    const val SERVER_AUTH_TYPE = "serverAuthType"
    const val SERVER_STREAM_RECEIVE_WINDOW = "serverStreamReceiveWindow"
    const val SERVER_CONNECTION_RECEIVE_WINDOW = "serverConnectionReceiveWindow"
    const val SERVER_DISABLE_MTU_DISCOVERY = "serverDisableMtuDiscovery"
    const val SERVER_HOP_INTERVAL = "hopInterval"

    const val SERVER_PRIVATE_KEY = "serverPrivateKey"
    const val SERVER_INSECURE_CONCURRENCY = "serverInsecureConcurrency"
    const val SERVER_NO_POST_QUANTUM = "serverNoPostQuantum"

    const val SERVER_UDP_RELAY_MODE = "serverUDPRelayMode"
    const val SERVER_CONGESTION_CONTROLLER = "serverCongestionController"
    const val SERVER_DISABLE_SNI = "serverDisableSNI"
    const val SERVER_REDUCE_RTT = "serverReduceRTT"

    const val ROUTE_NAME = "routeName"
    const val ROUTE_DOMAIN = "routeDomain"
    const val ROUTE_IP = "routeIP"
    const val ROUTE_PORT = "routePort"
    const val ROUTE_SOURCE_PORT = "routeSourcePort"
    const val ROUTE_NETWORK = "routeNetwork"
    const val ROUTE_SOURCE = "routeSource"
    const val ROUTE_PROTOCOL = "routeProtocol"
    const val ROUTE_OUTBOUND = "routeOutbound"
    const val ROUTE_PACKAGES = "routePackages"
    const val ROUTE_SSID = "routeSSID"
    const val ROUTE_BSSID = "routeBSSID"
    const val ROUTE_CLIENT = "routeClient"
    const val CLASH_MODE = "routeClashMode"

    const val GROUP_NAME = "groupName"
    const val GROUP_TYPE = "groupType"
    const val GROUP_ORDER = "groupOrder"
    const val GROUP_IS_SELECTOR = "groupIsSelector"
    const val GROUP_FRONT_PROXY = "groupFrontProxy"
    const val GROUP_LANDING_PROXY = "groupLandingProxy"

    const val GROUP_SUBSCRIPTION = "groupSubscription"
    const val SUBSCRIPTION_TYPE = "subscriptionType"
    const val SUBSCRIPTION_TOKEN = "subscriptionToken"
    const val SUBSCRIPTION_LINK = "subscriptionLink"
    const val SUBSCRIPTION_FORCE_RESOLVE = "subscriptionForceResolve"
    const val SUBSCRIPTION_DEDUPLICATION = "subscriptionDeduplication"
    const val SUBSCRIPTION_UPDATE = "subscriptionUpdate"
    const val SUBSCRIPTION_UPDATE_WHEN_CONNECTED_ONLY = "subscriptionUpdateWhenConnectedOnly"
    const val SUBSCRIPTION_USER_AGENT = "subscriptionUserAgent"
    const val SUBSCRIPTION_AUTO_UPDATE = "subscriptionAutoUpdate"
    const val SUBSCRIPTION_AUTO_UPDATE_DELAY = "subscriptionAutoUpdateDelay"

    //

    const val APP_TLS_VERSION = "appTLSVersion"
    const val CLASH_API_LISTEN = "clashAPIListen"
    const val ENABLED_CAZILLA = "enabledCazilla"
    const val INTERRUPT_SELECTOR = "interruptSelector"
}

object TunImplementation {
    const val GVISOR = 0
    const val SYSTEM = 1
    const val MIXED = 2
}

object IPv6Mode {
    const val DISABLE = 0
    const val ENABLE = 1
    const val PREFER = 2
    const val ONLY = 3
}

object GroupType {
    const val BASIC = 0
    const val SUBSCRIPTION = 1
}

object SubscriptionType {
    const val RAW = 0
    const val OOCv1 = 1
    const val SIP008 = 2
}

object GroupOrder {
    const val ORIGIN = 0
    const val BY_NAME = 1
    const val BY_DELAY = 2
}

object MuxType {
    const val H2MUX = 0
    const val SMUX = 1
    const val YAMUX = 2
}

object MuxStrategy {
    const val MAX_CONNECTIONS = 0
    const val MIN_STREAMS = 1
    const val MAX_STREAMS = 2
}

object Action {
    const val SERVICE = "io.nekohasekai.sagernet.SERVICE"
    const val CLOSE = "io.nekohasekai.sagernet.CLOSE"
    const val RELOAD = "io.nekohasekai.sagernet.RELOAD"

    // const val SWITCH_WAKE_LOCK = "io.nekohasekai.sagernet.SWITCH_WAKELOCK"
    const val RESET_UPSTREAM_CONNECTIONS = "io.nekohasekai.sagernet.RESET_UPSTREAM_CONNECTIONS"
}

object TrafficSortMode {
    const val START = 0
    const val INBOUND = 1
    const val SRC = 2
    const val DST = 3
    const val UPLOAD = 4
    const val DOWNLOAD = 5
    const val MATCHED_RULE = 6
}

object RuleProvider {
    const val OFFICIAL = 0
    const val LOYALSOLDIER = 1
    const val CHOCOLATE4U = 2
    const val CUSTOM = 3

    fun hasUnstableBranch(provider: Int): Boolean {
        return provider in OFFICIAL..LOYALSOLDIER
    }
}