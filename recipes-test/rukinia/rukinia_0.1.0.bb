# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get rukinia could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/rukinia/0.1.0"
SRC_URI += "git://git@github.com/ValentinBoudevin/rukinia.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "0e904f61f45fe117f8737011c5129d219b6af3d4"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+0e904f61f4"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.24.2 \
    crate://crates.io/adler2/2.0.0 \
    crate://crates.io/aho-corasick/1.1.3 \
    crate://crates.io/arraydeque/0.5.1 \
    crate://crates.io/async-trait/0.1.88 \
    crate://crates.io/autocfg/1.4.0 \
    crate://crates.io/backtrace/0.3.74 \
    crate://crates.io/base64/0.21.7 \
    crate://crates.io/base64/0.22.1 \
    crate://crates.io/bitflags/2.9.0 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/bumpalo/3.17.0 \
    crate://crates.io/bytes/1.10.1 \
    crate://crates.io/cc/1.2.17 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/cfg_aliases/0.2.1 \
    crate://crates.io/config/0.15.11 \
    crate://crates.io/const-random-macro/0.1.16 \
    crate://crates.io/const-random/0.1.18 \
    crate://crates.io/convert_case/0.6.0 \
    crate://crates.io/cpufeatures/0.2.17 \
    crate://crates.io/crunchy/0.2.3 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/csv-core/0.1.12 \
    crate://crates.io/csv/1.3.1 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/displaydoc/0.2.5 \
    crate://crates.io/dlv-list/0.5.2 \
    crate://crates.io/encoding_rs/0.8.35 \
    crate://crates.io/equivalent/1.0.2 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foldhash/0.1.5 \
    crate://crates.io/form_urlencoded/1.2.1 \
    crate://crates.io/futures-channel/0.3.31 \
    crate://crates.io/futures-core/0.3.31 \
    crate://crates.io/futures-task/0.3.31 \
    crate://crates.io/futures-util/0.3.31 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.2.15 \
    crate://crates.io/getrandom/0.3.2 \
    crate://crates.io/gimli/0.31.1 \
    crate://crates.io/hashbrown/0.14.5 \
    crate://crates.io/hashbrown/0.15.2 \
    crate://crates.io/hashlink/0.10.0 \
    crate://crates.io/http-body-util/0.1.3 \
    crate://crates.io/http-body/1.0.1 \
    crate://crates.io/http/1.3.1 \
    crate://crates.io/httparse/1.10.1 \
    crate://crates.io/hyper-rustls/0.27.5 \
    crate://crates.io/hyper-util/0.1.10 \
    crate://crates.io/hyper/1.6.0 \
    crate://crates.io/icu_collections/1.5.0 \
    crate://crates.io/icu_locid/1.5.0 \
    crate://crates.io/icu_locid_transform/1.5.0 \
    crate://crates.io/icu_locid_transform_data/1.5.1 \
    crate://crates.io/icu_normalizer/1.5.0 \
    crate://crates.io/icu_normalizer_data/1.5.1 \
    crate://crates.io/icu_properties/1.5.1 \
    crate://crates.io/icu_properties_data/1.5.1 \
    crate://crates.io/icu_provider/1.5.0 \
    crate://crates.io/icu_provider_macros/1.5.0 \
    crate://crates.io/idna/1.0.3 \
    crate://crates.io/idna_adapter/1.2.0 \
    crate://crates.io/indexmap/2.8.0 \
    crate://crates.io/ipnet/2.11.0 \
    crate://crates.io/itoa/1.0.15 \
    crate://crates.io/js-sys/0.3.77 \
    crate://crates.io/json5/0.4.1 \
    crate://crates.io/libc/0.2.171 \
    crate://crates.io/litemap/0.7.5 \
    crate://crates.io/log/0.4.27 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/memoffset/0.9.1 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/miniz_oxide/0.8.5 \
    crate://crates.io/mio/1.0.3 \
    crate://crates.io/nix/0.29.0 \
    crate://crates.io/object/0.36.7 \
    crate://crates.io/once_cell/1.21.3 \
    crate://crates.io/ordered-multimap/0.7.3 \
    crate://crates.io/pathdiff/0.2.3 \
    crate://crates.io/percent-encoding/2.3.1 \
    crate://crates.io/pest/2.8.0 \
    crate://crates.io/pest_derive/2.8.0 \
    crate://crates.io/pest_generator/2.8.0 \
    crate://crates.io/pest_meta/2.8.0 \
    crate://crates.io/pin-project-lite/0.2.16 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/ppv-lite86/0.2.21 \
    crate://crates.io/proc-macro2/1.0.94 \
    crate://crates.io/quinn-proto/0.11.10 \
    crate://crates.io/quinn-udp/0.5.11 \
    crate://crates.io/quinn/0.11.7 \
    crate://crates.io/quote/1.0.40 \
    crate://crates.io/r-efi/5.2.0 \
    crate://crates.io/rand/0.9.0 \
    crate://crates.io/rand_chacha/0.9.0 \
    crate://crates.io/rand_core/0.9.3 \
    crate://crates.io/regex-automata/0.4.9 \
    crate://crates.io/regex-syntax/0.8.5 \
    crate://crates.io/regex/1.11.1 \
    crate://crates.io/reqwest/0.12.15 \
    crate://crates.io/ring/0.17.14 \
    crate://crates.io/ron/0.8.1 \
    crate://crates.io/rust-ini/0.21.1 \
    crate://crates.io/rustc-demangle/0.1.24 \
    crate://crates.io/rustc-hash/2.1.1 \
    crate://crates.io/rustls-pemfile/2.2.0 \
    crate://crates.io/rustls-pki-types/1.11.0 \
    crate://crates.io/rustls-webpki/0.103.1 \
    crate://crates.io/rustls/0.23.25 \
    crate://crates.io/rustversion/1.0.20 \
    crate://crates.io/ryu/1.0.20 \
    crate://crates.io/serde/1.0.219 \
    crate://crates.io/serde_derive/1.0.219 \
    crate://crates.io/serde_json/1.0.140 \
    crate://crates.io/serde_spanned/0.6.8 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/sha2/0.10.8 \
    crate://crates.io/shlex/1.3.0 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/1.14.0 \
    crate://crates.io/socket2/0.5.8 \
    crate://crates.io/stable_deref_trait/1.2.0 \
    crate://crates.io/subtle/2.6.1 \
    crate://crates.io/syn/2.0.100 \
    crate://crates.io/sync_wrapper/1.0.2 \
    crate://crates.io/synstructure/0.13.1 \
    crate://crates.io/thiserror-impl/2.0.12 \
    crate://crates.io/thiserror/2.0.12 \
    crate://crates.io/tiny-keccak/2.0.2 \
    crate://crates.io/tinystr/0.7.6 \
    crate://crates.io/tinyvec/1.9.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-rustls/0.26.2 \
    crate://crates.io/tokio/1.44.1 \
    crate://crates.io/toml/0.8.20 \
    crate://crates.io/toml_datetime/0.6.8 \
    crate://crates.io/toml_edit/0.22.24 \
    crate://crates.io/tower-layer/0.3.3 \
    crate://crates.io/tower-service/0.3.3 \
    crate://crates.io/tower/0.5.2 \
    crate://crates.io/tracing-core/0.1.33 \
    crate://crates.io/tracing/0.1.41 \
    crate://crates.io/trim-in-place/0.1.7 \
    crate://crates.io/try-lock/0.2.5 \
    crate://crates.io/typenum/1.18.0 \
    crate://crates.io/ucd-trie/0.1.7 \
    crate://crates.io/unicode-ident/1.0.18 \
    crate://crates.io/unicode-segmentation/1.12.0 \
    crate://crates.io/untrusted/0.9.0 \
    crate://crates.io/url/2.5.4 \
    crate://crates.io/utf16_iter/1.0.5 \
    crate://crates.io/utf8_iter/1.0.4 \
    crate://crates.io/version_check/0.9.5 \
    crate://crates.io/want/0.3.1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.14.2+wasi-0.2.4 \
    crate://crates.io/wasm-bindgen-backend/0.2.100 \
    crate://crates.io/wasm-bindgen-futures/0.4.50 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.100 \
    crate://crates.io/wasm-bindgen-macro/0.2.100 \
    crate://crates.io/wasm-bindgen-shared/0.2.100 \
    crate://crates.io/wasm-bindgen/0.2.100 \
    crate://crates.io/web-sys/0.3.77 \
    crate://crates.io/web-time/1.1.0 \
    crate://crates.io/webpki-roots/0.26.8 \
    crate://crates.io/windows-link/0.1.1 \
    crate://crates.io/windows-registry/0.4.0 \
    crate://crates.io/windows-result/0.3.2 \
    crate://crates.io/windows-strings/0.3.1 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-sys/0.59.0 \
    crate://crates.io/windows-targets/0.52.6 \
    crate://crates.io/windows-targets/0.53.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.6 \
    crate://crates.io/windows_aarch64_gnullvm/0.53.0 \
    crate://crates.io/windows_aarch64_msvc/0.52.6 \
    crate://crates.io/windows_aarch64_msvc/0.53.0 \
    crate://crates.io/windows_i686_gnu/0.52.6 \
    crate://crates.io/windows_i686_gnu/0.53.0 \
    crate://crates.io/windows_i686_gnullvm/0.52.6 \
    crate://crates.io/windows_i686_gnullvm/0.53.0 \
    crate://crates.io/windows_i686_msvc/0.52.6 \
    crate://crates.io/windows_i686_msvc/0.53.0 \
    crate://crates.io/windows_x86_64_gnu/0.52.6 \
    crate://crates.io/windows_x86_64_gnu/0.53.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.6 \
    crate://crates.io/windows_x86_64_gnullvm/0.53.0 \
    crate://crates.io/windows_x86_64_msvc/0.52.6 \
    crate://crates.io/windows_x86_64_msvc/0.53.0 \
    crate://crates.io/winnow/0.7.4 \
    crate://crates.io/wit-bindgen-rt/0.39.0 \
    crate://crates.io/write16/1.0.0 \
    crate://crates.io/writeable/0.5.5 \
    crate://crates.io/yaml-rust2/0.10.1 \
    crate://crates.io/yoke-derive/0.7.5 \
    crate://crates.io/yoke/0.7.5 \
    crate://crates.io/zerocopy-derive/0.8.24 \
    crate://crates.io/zerocopy/0.8.24 \
    crate://crates.io/zerofrom-derive/0.1.6 \
    crate://crates.io/zerofrom/0.1.6 \
    crate://crates.io/zeroize/1.8.1 \
    crate://crates.io/zerovec-derive/0.10.3 \
    crate://crates.io/zerovec/0.10.4 \
"

SRC_URI[addr2line-0.24.2.sha256sum] = "dfbe277e56a376000877090da837660b4427aad530e3028d44e0bffe4f89a1c1"
SRC_URI[adler2-2.0.0.sha256sum] = "512761e0bb2578dd7380c6baaa0f4ce03e84f95e960231d1dec8bf4d7d6e2627"
SRC_URI[aho-corasick-1.1.3.sha256sum] = "8e60d3430d3a69478ad0993f19238d2df97c507009a52b3c10addcd7f6bcb916"
SRC_URI[arraydeque-0.5.1.sha256sum] = "7d902e3d592a523def97af8f317b08ce16b7ab854c1985a0c671e6f15cebc236"
SRC_URI[async-trait-0.1.88.sha256sum] = "e539d3fca749fcee5236ab05e93a52867dd549cc157c8cb7f99595f3cedffdb5"
SRC_URI[autocfg-1.4.0.sha256sum] = "ace50bade8e6234aa140d9a2f552bbee1db4d353f69b8217bc503490fc1a9f26"
SRC_URI[backtrace-0.3.74.sha256sum] = "8d82cb332cdfaed17ae235a638438ac4d4839913cc2af585c3c6746e8f8bee1a"
SRC_URI[base64-0.21.7.sha256sum] = "9d297deb1925b89f2ccc13d7635fa0714f12c87adce1c75356b39ca9b7178567"
SRC_URI[base64-0.22.1.sha256sum] = "72b3254f16251a8381aa12e40e3c4d2f0199f8c6508fbecb9d91f575e0fbb8c6"
SRC_URI[bitflags-2.9.0.sha256sum] = "5c8214115b7bf84099f1309324e63141d4c5d7cc26862f97a0a857dbefe165bd"
SRC_URI[block-buffer-0.10.4.sha256sum] = "3078c7629b62d3f0439517fa394996acacc5cbc91c5a20d8c658e77abd503a71"
SRC_URI[bumpalo-3.17.0.sha256sum] = "1628fb46dfa0b37568d12e5edd512553eccf6a22a78e8bde00bb4aed84d5bdbf"
SRC_URI[bytes-1.10.1.sha256sum] = "d71b6127be86fdcfddb610f7182ac57211d4b18a3e9c82eb2d17662f2227ad6a"
SRC_URI[cc-1.2.17.sha256sum] = "1fcb57c740ae1daf453ae85f16e37396f672b039e00d9d866e07ddb24e328e3a"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[cfg_aliases-0.2.1.sha256sum] = "613afe47fcd5fac7ccf1db93babcb082c5994d996f20b8b159f2ad1658eb5724"
SRC_URI[config-0.15.11.sha256sum] = "595aae20e65c3be792d05818e8c63025294ac3cb7e200f11459063a352a6ef80"
SRC_URI[const-random-macro-0.1.16.sha256sum] = "f9d839f2a20b0aee515dc581a6172f2321f96cab76c1a38a4c584a194955390e"
SRC_URI[const-random-0.1.18.sha256sum] = "87e00182fe74b066627d63b85fd550ac2998d4b0bd86bfed477a0ae4c7c71359"
SRC_URI[convert_case-0.6.0.sha256sum] = "ec182b0ca2f35d8fc196cf3404988fd8b8c739a4d270ff118a398feb0cbec1ca"
SRC_URI[cpufeatures-0.2.17.sha256sum] = "59ed5838eebb26a2bb2e58f6d5b5316989ae9d08bab10e0e6d103e656d1b0280"
SRC_URI[crunchy-0.2.3.sha256sum] = "43da5946c66ffcc7745f48db692ffbb10a83bfe0afd96235c5c2a4fb23994929"
SRC_URI[crypto-common-0.1.6.sha256sum] = "1bfb12502f3fc46cca1bb51ac28df9d618d813cdc3d2f25b9fe775a34af26bb3"
SRC_URI[csv-core-0.1.12.sha256sum] = "7d02f3b0da4c6504f86e9cd789d8dbafab48c2321be74e9987593de5a894d93d"
SRC_URI[csv-1.3.1.sha256sum] = "acdc4883a9c96732e4733212c01447ebd805833b7275a73ca3ee080fd77afdaf"
SRC_URI[digest-0.10.7.sha256sum] = "9ed9a281f7bc9b7576e61468ba615a66a5c8cfdff42420a70aa82701a3b1e292"
SRC_URI[displaydoc-0.2.5.sha256sum] = "97369cbbc041bc366949bc74d34658d6cda5621039731c6310521892a3a20ae0"
SRC_URI[dlv-list-0.5.2.sha256sum] = "442039f5147480ba31067cb00ada1adae6892028e40e45fc5de7b7df6dcc1b5f"
SRC_URI[encoding_rs-0.8.35.sha256sum] = "75030f3c4f45dafd7586dd6780965a8c7e8e285a5ecb86713e63a79c5b2766f3"
SRC_URI[equivalent-1.0.2.sha256sum] = "877a4ace8713b0bcf2a4e7eec82529c029f1d0619886d18145fea96c3ffe5c0f"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[foldhash-0.1.5.sha256sum] = "d9c4f5dac5e15c24eb999c26181a6ca40b39fe946cbe4c263c7209467bc83af2"
SRC_URI[form_urlencoded-1.2.1.sha256sum] = "e13624c2627564efccf4934284bdd98cbaa14e79b0b5a141218e507b3a823456"
SRC_URI[futures-channel-0.3.31.sha256sum] = "2dff15bf788c671c1934e366d07e30c1814a8ef514e1af724a602e8a2fbe1b10"
SRC_URI[futures-core-0.3.31.sha256sum] = "05f29059c0c2090612e8d742178b0580d2dc940c837851ad723096f87af6663e"
SRC_URI[futures-task-0.3.31.sha256sum] = "f90f7dce0722e95104fcb095585910c0977252f286e354b5e3bd38902cd99988"
SRC_URI[futures-util-0.3.31.sha256sum] = "9fa08315bb612088cc391249efdc3bc77536f16c91f6cf495e6fbe85b20a4a81"
SRC_URI[generic-array-0.14.7.sha256sum] = "85649ca51fd72272d7821adaf274ad91c288277713d9c18820d8499a7ff69e9a"
SRC_URI[getrandom-0.2.15.sha256sum] = "c4567c8db10ae91089c99af84c68c38da3ec2f087c3f82960bcdbf3656b6f4d7"
SRC_URI[getrandom-0.3.2.sha256sum] = "73fea8450eea4bac3940448fb7ae50d91f034f941199fcd9d909a5a07aa455f0"
SRC_URI[gimli-0.31.1.sha256sum] = "07e28edb80900c19c28f1072f2e8aeca7fa06b23cd4169cefe1af5aa3260783f"
SRC_URI[hashbrown-0.14.5.sha256sum] = "e5274423e17b7c9fc20b6e7e208532f9b19825d82dfd615708b70edd83df41f1"
SRC_URI[hashbrown-0.15.2.sha256sum] = "bf151400ff0baff5465007dd2f3e717f3fe502074ca563069ce3a6629d07b289"
SRC_URI[hashlink-0.10.0.sha256sum] = "7382cf6263419f2d8df38c55d7da83da5c18aef87fc7a7fc1fb1e344edfe14c1"
SRC_URI[http-body-util-0.1.3.sha256sum] = "b021d93e26becf5dc7e1b75b1bed1fd93124b374ceb73f43d4d4eafec896a64a"
SRC_URI[http-body-1.0.1.sha256sum] = "1efedce1fb8e6913f23e0c92de8e62cd5b772a67e7b3946df930a62566c93184"
SRC_URI[http-1.3.1.sha256sum] = "f4a85d31aea989eead29a3aaf9e1115a180df8282431156e533de47660892565"
SRC_URI[httparse-1.10.1.sha256sum] = "6dbf3de79e51f3d586ab4cb9d5c3e2c14aa28ed23d180cf89b4df0454a69cc87"
SRC_URI[hyper-rustls-0.27.5.sha256sum] = "2d191583f3da1305256f22463b9bb0471acad48a4e534a5218b9963e9c1f59b2"
SRC_URI[hyper-util-0.1.10.sha256sum] = "df2dcfbe0677734ab2f3ffa7fa7bfd4706bfdc1ef393f2ee30184aed67e631b4"
SRC_URI[hyper-1.6.0.sha256sum] = "cc2b571658e38e0c01b1fdca3bbbe93c00d3d71693ff2770043f8c29bc7d6f80"
SRC_URI[icu_collections-1.5.0.sha256sum] = "db2fa452206ebee18c4b5c2274dbf1de17008e874b4dc4f0aea9d01ca79e4526"
SRC_URI[icu_locid-1.5.0.sha256sum] = "13acbb8371917fc971be86fc8057c41a64b521c184808a698c02acc242dbf637"
SRC_URI[icu_locid_transform-1.5.0.sha256sum] = "01d11ac35de8e40fdeda00d9e1e9d92525f3f9d887cdd7aa81d727596788b54e"
SRC_URI[icu_locid_transform_data-1.5.1.sha256sum] = "7515e6d781098bf9f7205ab3fc7e9709d34554ae0b21ddbcb5febfa4bc7df11d"
SRC_URI[icu_normalizer-1.5.0.sha256sum] = "19ce3e0da2ec68599d193c93d088142efd7f9c5d6fc9b803774855747dc6a84f"
SRC_URI[icu_normalizer_data-1.5.1.sha256sum] = "c5e8338228bdc8ab83303f16b797e177953730f601a96c25d10cb3ab0daa0cb7"
SRC_URI[icu_properties-1.5.1.sha256sum] = "93d6020766cfc6302c15dbbc9c8778c37e62c14427cb7f6e601d849e092aeef5"
SRC_URI[icu_properties_data-1.5.1.sha256sum] = "85fb8799753b75aee8d2a21d7c14d9f38921b54b3dbda10f5a3c7a7b82dba5e2"
SRC_URI[icu_provider-1.5.0.sha256sum] = "6ed421c8a8ef78d3e2dbc98a973be2f3770cb42b606e3ab18d6237c4dfde68d9"
SRC_URI[icu_provider_macros-1.5.0.sha256sum] = "1ec89e9337638ecdc08744df490b221a7399bf8d164eb52a665454e60e075ad6"
SRC_URI[idna-1.0.3.sha256sum] = "686f825264d630750a544639377bae737628043f20d38bbc029e8f29ea968a7e"
SRC_URI[idna_adapter-1.2.0.sha256sum] = "daca1df1c957320b2cf139ac61e7bd64fed304c5040df000a745aa1de3b4ef71"
SRC_URI[indexmap-2.8.0.sha256sum] = "3954d50fe15b02142bf25d3b8bdadb634ec3948f103d04ffe3031bc8fe9d7058"
SRC_URI[ipnet-2.11.0.sha256sum] = "469fb0b9cefa57e3ef31275ee7cacb78f2fdca44e4765491884a2b119d4eb130"
SRC_URI[itoa-1.0.15.sha256sum] = "4a5f13b858c8d314ee3e8f639011f7ccefe71f97f96e50151fb991f267928e2c"
SRC_URI[js-sys-0.3.77.sha256sum] = "1cfaf33c695fc6e08064efbc1f72ec937429614f25eef83af942d0e227c3a28f"
SRC_URI[json5-0.4.1.sha256sum] = "96b0db21af676c1ce64250b5f40f3ce2cf27e4e47cb91ed91eb6fe9350b430c1"
SRC_URI[libc-0.2.171.sha256sum] = "c19937216e9d3aa9956d9bb8dfc0b0c8beb6058fc4f7a4dc4d850edf86a237d6"
SRC_URI[litemap-0.7.5.sha256sum] = "23fb14cb19457329c82206317a5663005a4d404783dc74f4252769b0d5f42856"
SRC_URI[log-0.4.27.sha256sum] = "13dc2df351e3202783a1fe0d44375f7295ffb4049267b0f3018346dc122a1d94"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[memoffset-0.9.1.sha256sum] = "488016bfae457b036d996092f6cb448677611ce4449e970ceaf42695203f218a"
SRC_URI[mime-0.3.17.sha256sum] = "6877bb514081ee2a7ff5ef9de3281f14a4dd4bceac4c09388074a6b5df8a139a"
SRC_URI[miniz_oxide-0.8.5.sha256sum] = "8e3e04debbb59698c15bacbb6d93584a8c0ca9cc3213cb423d31f760d8843ce5"
SRC_URI[mio-1.0.3.sha256sum] = "2886843bf800fba2e3377cff24abf6379b4c4d5c6681eaf9ea5b0d15090450bd"
SRC_URI[nix-0.29.0.sha256sum] = "71e2746dc3a24dd78b3cfcb7be93368c6de9963d30f43a6a73998a9cf4b17b46"
SRC_URI[object-0.36.7.sha256sum] = "62948e14d923ea95ea2c7c86c71013138b66525b86bdc08d2dcc262bdb497b87"
SRC_URI[once_cell-1.21.3.sha256sum] = "42f5e15c9953c5e4ccceeb2e7382a716482c34515315f7b03532b8b4e8393d2d"
SRC_URI[ordered-multimap-0.7.3.sha256sum] = "49203cdcae0030493bad186b28da2fa25645fa276a51b6fec8010d281e02ef79"
SRC_URI[pathdiff-0.2.3.sha256sum] = "df94ce210e5bc13cb6651479fa48d14f601d9858cfe0467f43ae157023b938d3"
SRC_URI[percent-encoding-2.3.1.sha256sum] = "e3148f5046208a5d56bcfc03053e3ca6334e51da8dfb19b6cdc8b306fae3283e"
SRC_URI[pest-2.8.0.sha256sum] = "198db74531d58c70a361c42201efde7e2591e976d518caf7662a47dc5720e7b6"
SRC_URI[pest_derive-2.8.0.sha256sum] = "d725d9cfd79e87dccc9341a2ef39d1b6f6353d68c4b33c177febbe1a402c97c5"
SRC_URI[pest_generator-2.8.0.sha256sum] = "db7d01726be8ab66ab32f9df467ae8b1148906685bbe75c82d1e65d7f5b3f841"
SRC_URI[pest_meta-2.8.0.sha256sum] = "7f9f832470494906d1fca5329f8ab5791cc60beb230c74815dff541cbd2b5ca0"
SRC_URI[pin-project-lite-0.2.16.sha256sum] = "3b3cff922bd51709b605d9ead9aa71031d81447142d828eb4a6eba76fe619f9b"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[ppv-lite86-0.2.21.sha256sum] = "85eae3c4ed2f50dcfe72643da4befc30deadb458a9b590d720cde2f2b1e97da9"
SRC_URI[proc-macro2-1.0.94.sha256sum] = "a31971752e70b8b2686d7e46ec17fb38dad4051d94024c88df49b667caea9c84"
SRC_URI[quinn-proto-0.11.10.sha256sum] = "b820744eb4dc9b57a3398183639c511b5a26d2ed702cedd3febaa1393caa22cc"
SRC_URI[quinn-udp-0.5.11.sha256sum] = "541d0f57c6ec747a90738a52741d3221f7960e8ac2f0ff4b1a63680e033b4ab5"
SRC_URI[quinn-0.11.7.sha256sum] = "c3bd15a6f2967aef83887dcb9fec0014580467e33720d073560cf015a5683012"
SRC_URI[quote-1.0.40.sha256sum] = "1885c039570dc00dcb4ff087a89e185fd56bae234ddc7f056a945bf36467248d"
SRC_URI[r-efi-5.2.0.sha256sum] = "74765f6d916ee2faa39bc8e68e4f3ed8949b48cccdac59983d287a7cb71ce9c5"
SRC_URI[rand-0.9.0.sha256sum] = "3779b94aeb87e8bd4e834cee3650289ee9e0d5677f976ecdb6d219e5f4f6cd94"
SRC_URI[rand_chacha-0.9.0.sha256sum] = "d3022b5f1df60f26e1ffddd6c66e8aa15de382ae63b3a0c1bfc0e4d3e3f325cb"
SRC_URI[rand_core-0.9.3.sha256sum] = "99d9a13982dcf210057a8a78572b2217b667c3beacbf3a0d8b454f6f82837d38"
SRC_URI[regex-automata-0.4.9.sha256sum] = "809e8dc61f6de73b46c85f4c96486310fe304c434cfa43669d7b40f711150908"
SRC_URI[regex-syntax-0.8.5.sha256sum] = "2b15c43186be67a4fd63bee50d0303afffcef381492ebe2c5d87f324e1b8815c"
SRC_URI[regex-1.11.1.sha256sum] = "b544ef1b4eac5dc2db33ea63606ae9ffcfac26c1416a2806ae0bf5f56b201191"
SRC_URI[reqwest-0.12.15.sha256sum] = "d19c46a6fdd48bc4dab94b6103fccc55d34c67cc0ad04653aad4ea2a07cd7bbb"
SRC_URI[ring-0.17.14.sha256sum] = "a4689e6c2294d81e88dc6261c768b63bc4fcdb852be6d1352498b114f61383b7"
SRC_URI[ron-0.8.1.sha256sum] = "b91f7eff05f748767f183df4320a63d6936e9c6107d97c9e6bdd9784f4289c94"
SRC_URI[rust-ini-0.21.1.sha256sum] = "4e310ef0e1b6eeb79169a1171daf9abcb87a2e17c03bee2c4bb100b55c75409f"
SRC_URI[rustc-demangle-0.1.24.sha256sum] = "719b953e2095829ee67db738b3bfa9fa368c94900df327b3f07fe6e794d2fe1f"
SRC_URI[rustc-hash-2.1.1.sha256sum] = "357703d41365b4b27c590e3ed91eabb1b663f07c4c084095e60cbed4362dff0d"
SRC_URI[rustls-pemfile-2.2.0.sha256sum] = "dce314e5fee3f39953d46bb63bb8a46d40c2f8fb7cc5a3b6cab2bde9721d6e50"
SRC_URI[rustls-pki-types-1.11.0.sha256sum] = "917ce264624a4b4db1c364dcc35bfca9ded014d0a958cd47ad3e960e988ea51c"
SRC_URI[rustls-webpki-0.103.1.sha256sum] = "fef8b8769aaccf73098557a87cd1816b4f9c7c16811c9c77142aa695c16f2c03"
SRC_URI[rustls-0.23.25.sha256sum] = "822ee9188ac4ec04a2f0531e55d035fb2de73f18b41a63c70c2712503b6fb13c"
SRC_URI[rustversion-1.0.20.sha256sum] = "eded382c5f5f786b989652c49544c4877d9f015cc22e145a5ea8ea66c2921cd2"
SRC_URI[ryu-1.0.20.sha256sum] = "28d3b2b1366ec20994f1fd18c3c594f05c5dd4bc44d8bb0c1c632c8d6829481f"
SRC_URI[serde-1.0.219.sha256sum] = "5f0e2c6ed6606019b4e29e69dbaba95b11854410e5347d525002456dbbb786b6"
SRC_URI[serde_derive-1.0.219.sha256sum] = "5b0276cf7f2c73365f7157c8123c21cd9a50fbbd844757af28ca1f5925fc2a00"
SRC_URI[serde_json-1.0.140.sha256sum] = "20068b6e96dc6c9bd23e01df8827e6c7e1f2fddd43c21810382803c136b99373"
SRC_URI[serde_spanned-0.6.8.sha256sum] = "87607cb1398ed59d48732e575a4c28a7a8ebf2454b964fe3f224f2afc07909e1"
SRC_URI[serde_urlencoded-0.7.1.sha256sum] = "d3491c14715ca2294c4d6a88f15e84739788c1d030eed8c110436aafdaa2f3fd"
SRC_URI[sha2-0.10.8.sha256sum] = "793db75ad2bcafc3ffa7c68b215fee268f537982cd901d132f89c6343f3a3dc8"
SRC_URI[shlex-1.3.0.sha256sum] = "0fda2ff0d084019ba4d7c6f371c95d8fd75ce3524c3cb8fb653a3023f6323e64"
SRC_URI[slab-0.4.9.sha256sum] = "8f92a496fb766b417c996b9c5e57daf2f7ad3b0bebe1ccfca4856390e3d3bb67"
SRC_URI[smallvec-1.14.0.sha256sum] = "7fcf8323ef1faaee30a44a340193b1ac6814fd9b7b4e88e9d4519a3e4abe1cfd"
SRC_URI[socket2-0.5.8.sha256sum] = "c970269d99b64e60ec3bd6ad27270092a5394c4e309314b18ae3fe575695fbe8"
SRC_URI[stable_deref_trait-1.2.0.sha256sum] = "a8f112729512f8e442d81f95a8a7ddf2b7c6b8a1a6f509a95864142b30cab2d3"
SRC_URI[subtle-2.6.1.sha256sum] = "13c2bddecc57b384dee18652358fb23172facb8a2c51ccc10d74c157bdea3292"
SRC_URI[syn-2.0.100.sha256sum] = "b09a44accad81e1ba1cd74a32461ba89dee89095ba17b32f5d03683b1b1fc2a0"
SRC_URI[sync_wrapper-1.0.2.sha256sum] = "0bf256ce5efdfa370213c1dabab5935a12e49f2c58d15e9eac2870d3b4f27263"
SRC_URI[synstructure-0.13.1.sha256sum] = "c8af7666ab7b6390ab78131fb5b0fce11d6b7a6951602017c35fa82800708971"
SRC_URI[thiserror-impl-2.0.12.sha256sum] = "7f7cf42b4507d8ea322120659672cf1b9dbb93f8f2d4ecfd6e51350ff5b17a1d"
SRC_URI[thiserror-2.0.12.sha256sum] = "567b8a2dae586314f7be2a752ec7474332959c6460e02bde30d702a66d488708"
SRC_URI[tiny-keccak-2.0.2.sha256sum] = "2c9d3793400a45f954c52e73d068316d76b6f4e36977e3fcebb13a2721e80237"
SRC_URI[tinystr-0.7.6.sha256sum] = "9117f5d4db391c1cf6927e7bea3db74b9a1c1add8f7eda9ffd5364f40f57b82f"
SRC_URI[tinyvec-1.9.0.sha256sum] = "09b3661f17e86524eccd4371ab0429194e0d7c008abb45f7a7495b1719463c71"
SRC_URI[tinyvec_macros-0.1.1.sha256sum] = "1f3ccbac311fea05f86f61904b462b55fb3df8837a366dfc601a0161d0532f20"
SRC_URI[tokio-rustls-0.26.2.sha256sum] = "8e727b36a1a0e8b74c376ac2211e40c2c8af09fb4013c60d910495810f008e9b"
SRC_URI[tokio-1.44.1.sha256sum] = "f382da615b842244d4b8738c82ed1275e6c5dd90c459a30941cd07080b06c91a"
SRC_URI[toml-0.8.20.sha256sum] = "cd87a5cdd6ffab733b2f74bc4fd7ee5fff6634124999ac278c35fc78c6120148"
SRC_URI[toml_datetime-0.6.8.sha256sum] = "0dd7358ecb8fc2f8d014bf86f6f638ce72ba252a2c3a2572f2a795f1d23efb41"
SRC_URI[toml_edit-0.22.24.sha256sum] = "17b4795ff5edd201c7cd6dca065ae59972ce77d1b80fa0a84d94950ece7d1474"
SRC_URI[tower-layer-0.3.3.sha256sum] = "121c2a6cda46980bb0fcd1647ffaf6cd3fc79a013de288782836f6df9c48780e"
SRC_URI[tower-service-0.3.3.sha256sum] = "8df9b6e13f2d32c91b9bd719c00d1958837bc7dec474d94952798cc8e69eeec3"
SRC_URI[tower-0.5.2.sha256sum] = "d039ad9159c98b70ecfd540b2573b97f7f52c3e8d9f8ad57a24b916a536975f9"
SRC_URI[tracing-core-0.1.33.sha256sum] = "e672c95779cf947c5311f83787af4fa8fffd12fb27e4993211a84bdfd9610f9c"
SRC_URI[tracing-0.1.41.sha256sum] = "784e0ac535deb450455cbfa28a6f0df145ea1bb7ae51b821cf5e7927fdcfbdd0"
SRC_URI[trim-in-place-0.1.7.sha256sum] = "343e926fc669bc8cde4fa3129ab681c63671bae288b1f1081ceee6d9d37904fc"
SRC_URI[try-lock-0.2.5.sha256sum] = "e421abadd41a4225275504ea4d6566923418b7f05506fbc9c0fe86ba7396114b"
SRC_URI[typenum-1.18.0.sha256sum] = "1dccffe3ce07af9386bfd29e80c0ab1a8205a2fc34e4bcd40364df902cfa8f3f"
SRC_URI[ucd-trie-0.1.7.sha256sum] = "2896d95c02a80c6d6a5d6e953d479f5ddf2dfdb6a244441010e373ac0fb88971"
SRC_URI[unicode-ident-1.0.18.sha256sum] = "5a5f39404a5da50712a4c1eecf25e90dd62b613502b7e925fd4e4d19b5c96512"
SRC_URI[unicode-segmentation-1.12.0.sha256sum] = "f6ccf251212114b54433ec949fd6a7841275f9ada20dddd2f29e9ceea4501493"
SRC_URI[untrusted-0.9.0.sha256sum] = "8ecb6da28b8a351d773b68d5825ac39017e680750f980f3a1a85cd8dd28a47c1"
SRC_URI[url-2.5.4.sha256sum] = "32f8b686cadd1473f4bd0117a5d28d36b1ade384ea9b5069a1c40aefed7fda60"
SRC_URI[utf16_iter-1.0.5.sha256sum] = "c8232dd3cdaed5356e0f716d285e4b40b932ac434100fe9b7e0e8e935b9e6246"
SRC_URI[utf8_iter-1.0.4.sha256sum] = "b6c140620e7ffbb22c2dee59cafe6084a59b5ffc27a8859a5f0d494b5d52b6be"
SRC_URI[version_check-0.9.5.sha256sum] = "0b928f33d975fc6ad9f86c8f283853ad26bdd5b10b7f1542aa2fa15e2289105a"
SRC_URI[want-0.3.1.sha256sum] = "bfa7760aed19e106de2c7c0b581b509f2f25d3dacaf737cb82ac61bc6d760b0e"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasi-0.14.2+wasi-0.2.4.sha256sum] = "9683f9a5a998d873c0d21fcbe3c083009670149a8fab228644b8bd36b2c48cb3"
SRC_URI[wasm-bindgen-backend-0.2.100.sha256sum] = "2f0a0651a5c2bc21487bde11ee802ccaf4c51935d0d3d42a6101f98161700bc6"
SRC_URI[wasm-bindgen-futures-0.4.50.sha256sum] = "555d470ec0bc3bb57890405e5d4322cc9ea83cebb085523ced7be4144dac1e61"
SRC_URI[wasm-bindgen-macro-support-0.2.100.sha256sum] = "8ae87ea40c9f689fc23f209965b6fb8a99ad69aeeb0231408be24920604395de"
SRC_URI[wasm-bindgen-macro-0.2.100.sha256sum] = "7fe63fc6d09ed3792bd0897b314f53de8e16568c2b3f7982f468c0bf9bd0b407"
SRC_URI[wasm-bindgen-shared-0.2.100.sha256sum] = "1a05d73b933a847d6cccdda8f838a22ff101ad9bf93e33684f39c1f5f0eece3d"
SRC_URI[wasm-bindgen-0.2.100.sha256sum] = "1edc8929d7499fc4e8f0be2262a241556cfc54a0bea223790e71446f2aab1ef5"
SRC_URI[web-sys-0.3.77.sha256sum] = "33b6dd2ef9186f1f2072e409e99cd22a975331a6b3591b12c764e0e55c60d5d2"
SRC_URI[web-time-1.1.0.sha256sum] = "5a6580f308b1fad9207618087a65c04e7a10bc77e02c8e84e9b00dd4b12fa0bb"
SRC_URI[webpki-roots-0.26.8.sha256sum] = "2210b291f7ea53617fbafcc4939f10914214ec15aace5ba62293a668f322c5c9"
SRC_URI[windows-link-0.1.1.sha256sum] = "76840935b766e1b0a05c0066835fb9ec80071d4c09a16f6bd5f7e655e3c14c38"
SRC_URI[windows-registry-0.4.0.sha256sum] = "4286ad90ddb45071efd1a66dfa43eb02dd0dfbae1545ad6cc3c51cf34d7e8ba3"
SRC_URI[windows-result-0.3.2.sha256sum] = "c64fd11a4fd95df68efcfee5f44a294fe71b8bc6a91993e2791938abcc712252"
SRC_URI[windows-strings-0.3.1.sha256sum] = "87fa48cc5d406560701792be122a10132491cff9d0aeb23583cc2dcafc847319"
SRC_URI[windows-sys-0.52.0.sha256sum] = "282be5f36a8ce781fad8c8ae18fa3f9beff57ec1b52cb3de0789201425d9a33d"
SRC_URI[windows-sys-0.59.0.sha256sum] = "1e38bc4d79ed67fd075bcc251a1c39b32a1776bbe92e5bef1f0bf1f8c531853b"
SRC_URI[windows-targets-0.52.6.sha256sum] = "9b724f72796e036ab90c1021d4780d4d3d648aca59e491e6b98e725b84e99973"
SRC_URI[windows-targets-0.53.0.sha256sum] = "b1e4c7e8ceaaf9cb7d7507c974735728ab453b67ef8f18febdd7c11fe59dca8b"
SRC_URI[windows_aarch64_gnullvm-0.52.6.sha256sum] = "32a4622180e7a0ec044bb555404c800bc9fd9ec262ec147edd5989ccd0c02cd3"
SRC_URI[windows_aarch64_gnullvm-0.53.0.sha256sum] = "86b8d5f90ddd19cb4a147a5fa63ca848db3df085e25fee3cc10b39b6eebae764"
SRC_URI[windows_aarch64_msvc-0.52.6.sha256sum] = "09ec2a7bb152e2252b53fa7803150007879548bc709c039df7627cabbd05d469"
SRC_URI[windows_aarch64_msvc-0.53.0.sha256sum] = "c7651a1f62a11b8cbd5e0d42526e55f2c99886c77e007179efff86c2b137e66c"
SRC_URI[windows_i686_gnu-0.52.6.sha256sum] = "8e9b5ad5ab802e97eb8e295ac6720e509ee4c243f69d781394014ebfe8bbfa0b"
SRC_URI[windows_i686_gnu-0.53.0.sha256sum] = "c1dc67659d35f387f5f6c479dc4e28f1d4bb90ddd1a5d3da2e5d97b42d6272c3"
SRC_URI[windows_i686_gnullvm-0.52.6.sha256sum] = "0eee52d38c090b3caa76c563b86c3a4bd71ef1a819287c19d586d7334ae8ed66"
SRC_URI[windows_i686_gnullvm-0.53.0.sha256sum] = "9ce6ccbdedbf6d6354471319e781c0dfef054c81fbc7cf83f338a4296c0cae11"
SRC_URI[windows_i686_msvc-0.52.6.sha256sum] = "240948bc05c5e7c6dabba28bf89d89ffce3e303022809e73deaefe4f6ec56c66"
SRC_URI[windows_i686_msvc-0.53.0.sha256sum] = "581fee95406bb13382d2f65cd4a908ca7b1e4c2f1917f143ba16efe98a589b5d"
SRC_URI[windows_x86_64_gnu-0.52.6.sha256sum] = "147a5c80aabfbf0c7d901cb5895d1de30ef2907eb21fbbab29ca94c5b08b1a78"
SRC_URI[windows_x86_64_gnu-0.53.0.sha256sum] = "2e55b5ac9ea33f2fc1716d1742db15574fd6fc8dadc51caab1c16a3d3b4190ba"
SRC_URI[windows_x86_64_gnullvm-0.52.6.sha256sum] = "24d5b23dc417412679681396f2b49f3de8c1473deb516bd34410872eff51ed0d"
SRC_URI[windows_x86_64_gnullvm-0.53.0.sha256sum] = "0a6e035dd0599267ce1ee132e51c27dd29437f63325753051e71dd9e42406c57"
SRC_URI[windows_x86_64_msvc-0.52.6.sha256sum] = "589f6da84c646204747d1270a2a5661ea66ed1cced2631d546fdfb155959f9ec"
SRC_URI[windows_x86_64_msvc-0.53.0.sha256sum] = "271414315aff87387382ec3d271b52d7ae78726f5d44ac98b4f4030c91880486"
SRC_URI[winnow-0.7.4.sha256sum] = "0e97b544156e9bebe1a0ffbc03484fc1ffe3100cbce3ffb17eac35f7cdd7ab36"
SRC_URI[wit-bindgen-rt-0.39.0.sha256sum] = "6f42320e61fe2cfd34354ecb597f86f413484a798ba44a8ca1165c58d42da6c1"
SRC_URI[write16-1.0.0.sha256sum] = "d1890f4022759daae28ed4fe62859b1236caebfc61ede2f63ed4e695f3f6d936"
SRC_URI[writeable-0.5.5.sha256sum] = "1e9df38ee2d2c3c5948ea468a8406ff0db0b29ae1ffde1bcf20ef305bcc95c51"
SRC_URI[yaml-rust2-0.10.1.sha256sum] = "818913695e83ece1f8d2a1c52d54484b7b46d0f9c06beeb2649b9da50d9b512d"
SRC_URI[yoke-derive-0.7.5.sha256sum] = "2380878cad4ac9aac1e2435f3eb4020e8374b5f13c296cb75b4620ff8e229154"
SRC_URI[yoke-0.7.5.sha256sum] = "120e6aef9aa629e3d4f52dc8cc43a015c7724194c97dfaf45180d2daf2b77f40"
SRC_URI[zerocopy-derive-0.8.24.sha256sum] = "a996a8f63c5c4448cd959ac1bab0aaa3306ccfd060472f85943ee0750f0169be"
SRC_URI[zerocopy-0.8.24.sha256sum] = "2586fea28e186957ef732a5f8b3be2da217d65c5969d4b1e17f973ebbe876879"
SRC_URI[zerofrom-derive-0.1.6.sha256sum] = "d71e5d6e06ab090c67b5e44993ec16b72dcbaabc526db883a360057678b48502"
SRC_URI[zerofrom-0.1.6.sha256sum] = "50cc42e0333e05660c3587f3bf9d0478688e15d870fab3346451ce7f8c9fbea5"
SRC_URI[zeroize-1.8.1.sha256sum] = "ced3678a2879b30306d323f4542626697a464a97c0a07c9aebf7ebca65cd4dde"
SRC_URI[zerovec-derive-0.10.3.sha256sum] = "6eafa6dfb17584ea3e2bd6e76e0cc15ad7af12b09abdd1ca55961bed9b1063c6"
SRC_URI[zerovec-0.10.4.sha256sum] = "aa2b893d79df23bfb12d5461018d408ea19dfafe76c2c7ef6d4eba614f8ff079"

# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

SUMMARY = "Small tester for embedded linux system"
HOMEPAGE = "https://github.com/ValentinBoudevin/rukinia.git"
LICENSE = "CLOSED"

INSANE_SKIP:${PN} += "already-stripped"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include rukinia-${PV}.inc
include rukinia.inc
