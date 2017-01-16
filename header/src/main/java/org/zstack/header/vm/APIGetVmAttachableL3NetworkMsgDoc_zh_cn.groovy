package org.zstack.header.vm

doc {
    title "GetVmAttachableL3Network"

    category "vmInstance"

    desc "在这里填写API描述"

    rest {
        request {
            url "GET /v1/vm-instances/{vmInstanceUuid}/l3-networks-candidates"


            header(OAuth: 'the-session-uuid')

            clz APIGetVmAttachableL3NetworkMsg.class

            desc ""

            params {

                column {
                    name "vmInstanceUuid"
                    enclosedIn ""
                    desc "云主机UUID"
                    location "url"
                    type "String"
                    optional false
                    since "0.6"

                }
                column {
                    name "systemTags"
                    enclosedIn ""
                    desc "系统标签"
                    location "query"
                    type "List"
                    optional true
                    since "0.6"

                }
                column {
                    name "userTags"
                    enclosedIn ""
                    desc "用户标签"
                    location "query"
                    type "List"
                    optional true
                    since "0.6"

                }
            }
        }

        response {
            clz APIGetVmAttachableL3NetworkReply.class
        }
    }
}