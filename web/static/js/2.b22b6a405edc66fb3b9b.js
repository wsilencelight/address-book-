webpackJsonp([2],{"3tc2":function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n={render:function(){var e=this.$createElement,t=this._self._c||e;return t("div",{staticClass:"header"},[t("router-link",{attrs:{to:"/"}},[t("div",{staticClass:"iconfont back-icon"},[this._v("")])]),this._v(" "),t("span",[this._v("通讯录")])],1)},staticRenderFns:[]};var i=a("VU/8")({name:"CreateHeader"},n,!1,function(e){a("oOk+")},"data-v-3786763f",null).exports,s=a("mtWM"),r=a.n(s),o={name:"Create",components:{CreateHeader:i},data:function(){return{name:"",email:"",phone:""}},methods:{handleInputSubmit:function(){if(!0===this.handleInputReg()){var e=new URLSearchParams;e.append("name",this.name),e.append("phonenumber",this.phone),e.append("email",this.email),r.a.post("api/addUser",e).then(function(e){var t=e.data;alert(t.desc)})}else alert("您所输入的格式有误")},handleInputReg:function(){return/^1[0-9]{10}$/.test(this.phone)&&/^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$/.test(this.email)}},activated:function(){this.name="",this.phone="",this.email=""}},u={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("create-header"),e._v(" "),e._m(0),e._v(" "),a("div",{staticClass:"input-body"},[a("div",{staticClass:"input-item"},[e._v("\n      联系人姓名\n      "),a("input",{directives:[{name:"model",rawName:"v-model",value:e.name,expression:"name"}],attrs:{type:"text"},domProps:{value:e.name},on:{input:function(t){t.target.composing||(e.name=t.target.value)}}})]),e._v(" "),a("div",{staticClass:"input-item"},[e._v("\n      联系人电话\n      "),a("input",{directives:[{name:"model",rawName:"v-model",value:e.phone,expression:"phone"}],attrs:{type:"text"},domProps:{value:e.phone},on:{input:function(t){t.target.composing||(e.phone=t.target.value)}}})]),e._v(" "),a("div",{staticClass:"input-item"},[e._v("\n      联系人邮箱\n      "),a("input",{directives:[{name:"model",rawName:"v-model",value:e.email,expression:"email"}],attrs:{type:"email"},domProps:{value:e.email},on:{input:function(t){t.target.composing||(e.email=t.target.value)}}})]),e._v(" "),a("div",{staticClass:"input-confirm"},[a("input",{attrs:{type:"button",value:"提交"},on:{click:e.handleInputSubmit}})])])],1)},staticRenderFns:[function(){var e=this.$createElement,t=this._self._c||e;return t("div",{staticClass:"icon-img"},[t("img",{attrs:{src:a("SeSr"),alt:"头像"}})])}]};var c=a("VU/8")(o,u,!1,function(e){a("dky5")},"data-v-7c958c23",null);t.default=c.exports},dky5:function(e,t){},"oOk+":function(e,t){}});
//# sourceMappingURL=2.b22b6a405edc66fb3b9b.js.map