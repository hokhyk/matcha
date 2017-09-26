// Code generated by protoc-gen-go. DO NOT EDIT.
// source: gomatcha.io/matcha/proto/view/android/stackview.proto

package android

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import matcha "gomatcha.io/matcha/proto"
import matcha_text "gomatcha.io/matcha/proto/text"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

type StackChildView struct {
	ScreenId int64 `protobuf:"varint,3,opt,name=screenId" json:"screenId,omitempty"`
}

func (m *StackChildView) Reset()                    { *m = StackChildView{} }
func (m *StackChildView) String() string            { return proto.CompactTextString(m) }
func (*StackChildView) ProtoMessage()               {}
func (*StackChildView) Descriptor() ([]byte, []int) { return fileDescriptor1, []int{0} }

func (m *StackChildView) GetScreenId() int64 {
	if m != nil {
		return m.ScreenId
	}
	return 0
}

type StackView struct {
	Children []*StackChildView `protobuf:"bytes,1,rep,name=children" json:"children,omitempty"`
}

func (m *StackView) Reset()                    { *m = StackView{} }
func (m *StackView) String() string            { return proto.CompactTextString(m) }
func (*StackView) ProtoMessage()               {}
func (*StackView) Descriptor() ([]byte, []int) { return fileDescriptor1, []int{1} }

func (m *StackView) GetChildren() []*StackChildView {
	if m != nil {
		return m.Children
	}
	return nil
}

type StackBar struct {
	Title            string                  `protobuf:"bytes,1,opt,name=title" json:"title,omitempty"`
	StyledTitle      *matcha_text.StyledText `protobuf:"bytes,6,opt,name=styledTitle" json:"styledTitle,omitempty"`
	Subtitle         string                  `protobuf:"bytes,3,opt,name=subtitle" json:"subtitle,omitempty"`
	StyledSubtitle   *matcha_text.StyledText `protobuf:"bytes,7,opt,name=styledSubtitle" json:"styledSubtitle,omitempty"`
	Color            *matcha.Color           `protobuf:"bytes,4,opt,name=color" json:"color,omitempty"`
	Items            []*StackBarItem         `protobuf:"bytes,5,rep,name=items" json:"items,omitempty"`
	BackButtonHidden bool                    `protobuf:"varint,2,opt,name=backButtonHidden" json:"backButtonHidden,omitempty"`
}

func (m *StackBar) Reset()                    { *m = StackBar{} }
func (m *StackBar) String() string            { return proto.CompactTextString(m) }
func (*StackBar) ProtoMessage()               {}
func (*StackBar) Descriptor() ([]byte, []int) { return fileDescriptor1, []int{2} }

func (m *StackBar) GetTitle() string {
	if m != nil {
		return m.Title
	}
	return ""
}

func (m *StackBar) GetStyledTitle() *matcha_text.StyledText {
	if m != nil {
		return m.StyledTitle
	}
	return nil
}

func (m *StackBar) GetSubtitle() string {
	if m != nil {
		return m.Subtitle
	}
	return ""
}

func (m *StackBar) GetStyledSubtitle() *matcha_text.StyledText {
	if m != nil {
		return m.StyledSubtitle
	}
	return nil
}

func (m *StackBar) GetColor() *matcha.Color {
	if m != nil {
		return m.Color
	}
	return nil
}

func (m *StackBar) GetItems() []*StackBarItem {
	if m != nil {
		return m.Items
	}
	return nil
}

func (m *StackBar) GetBackButtonHidden() bool {
	if m != nil {
		return m.BackButtonHidden
	}
	return false
}

type StackBarItem struct {
	Title       string                  `protobuf:"bytes,1,opt,name=title" json:"title,omitempty"`
	Icon        *matcha.ImageOrResource `protobuf:"bytes,3,opt,name=icon" json:"icon,omitempty"`
	IconTint    *matcha.Color           `protobuf:"bytes,2,opt,name=iconTint" json:"iconTint,omitempty"`
	Disabled    bool                    `protobuf:"varint,4,opt,name=disabled" json:"disabled,omitempty"`
	OnPressFunc string                  `protobuf:"bytes,5,opt,name=onPressFunc" json:"onPressFunc,omitempty"`
}

func (m *StackBarItem) Reset()                    { *m = StackBarItem{} }
func (m *StackBarItem) String() string            { return proto.CompactTextString(m) }
func (*StackBarItem) ProtoMessage()               {}
func (*StackBarItem) Descriptor() ([]byte, []int) { return fileDescriptor1, []int{3} }

func (m *StackBarItem) GetTitle() string {
	if m != nil {
		return m.Title
	}
	return ""
}

func (m *StackBarItem) GetIcon() *matcha.ImageOrResource {
	if m != nil {
		return m.Icon
	}
	return nil
}

func (m *StackBarItem) GetIconTint() *matcha.Color {
	if m != nil {
		return m.IconTint
	}
	return nil
}

func (m *StackBarItem) GetDisabled() bool {
	if m != nil {
		return m.Disabled
	}
	return false
}

func (m *StackBarItem) GetOnPressFunc() string {
	if m != nil {
		return m.OnPressFunc
	}
	return ""
}

type StackEvent struct {
	Id []int64 `protobuf:"varint,1,rep,packed,name=id" json:"id,omitempty"`
}

func (m *StackEvent) Reset()                    { *m = StackEvent{} }
func (m *StackEvent) String() string            { return proto.CompactTextString(m) }
func (*StackEvent) ProtoMessage()               {}
func (*StackEvent) Descriptor() ([]byte, []int) { return fileDescriptor1, []int{4} }

func (m *StackEvent) GetId() []int64 {
	if m != nil {
		return m.Id
	}
	return nil
}

func init() {
	proto.RegisterType((*StackChildView)(nil), "matcha.view.android.StackChildView")
	proto.RegisterType((*StackView)(nil), "matcha.view.android.StackView")
	proto.RegisterType((*StackBar)(nil), "matcha.view.android.StackBar")
	proto.RegisterType((*StackBarItem)(nil), "matcha.view.android.StackBarItem")
	proto.RegisterType((*StackEvent)(nil), "matcha.view.android.StackEvent")
}

func init() {
	proto.RegisterFile("gomatcha.io/matcha/proto/view/android/stackview.proto", fileDescriptor1)
}

var fileDescriptor1 = []byte{
	// 459 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x7c, 0x52, 0x5d, 0x6b, 0xd4, 0x40,
	0x14, 0x25, 0x9b, 0xa6, 0x4d, 0x6f, 0x74, 0x95, 0x51, 0x30, 0x2c, 0x3e, 0xc4, 0x54, 0x21, 0x7e,
	0x90, 0x40, 0x45, 0xc4, 0xa7, 0x62, 0x8a, 0xe2, 0x82, 0xd2, 0x65, 0xb6, 0xf8, 0xe0, 0x5b, 0x92,
	0xb9, 0xb4, 0x83, 0xd9, 0x19, 0x99, 0xcc, 0xb6, 0xf5, 0xef, 0xf8, 0x33, 0x7c, 0xf4, 0x97, 0x49,
	0xee, 0xec, 0x86, 0xad, 0x75, 0xfb, 0x92, 0xc9, 0x3d, 0xf7, 0x9c, 0x33, 0x73, 0x0f, 0x17, 0xde,
	0x9c, 0xe9, 0x45, 0x65, 0x9b, 0xf3, 0x2a, 0x97, 0xba, 0x70, 0x7f, 0xc5, 0x0f, 0xa3, 0xad, 0x2e,
	0x2e, 0x24, 0x5e, 0x16, 0x95, 0x12, 0x46, 0x4b, 0x51, 0x74, 0xb6, 0x6a, 0xbe, 0xf7, 0x48, 0x4e,
	0x4d, 0xf6, 0x60, 0x25, 0x22, 0x68, 0x45, 0x9a, 0x3c, 0xdd, 0xea, 0x25, 0x17, 0xd5, 0x19, 0x3a,
	0xe9, 0x24, 0xdb, 0xca, 0xb2, 0x78, 0x65, 0xe9, 0xe3, 0x98, 0xe9, 0x2b, 0x18, 0xcf, 0xfb, 0x7b,
	0x8f, 0xcf, 0x65, 0x2b, 0xbe, 0x4a, 0xbc, 0x64, 0x13, 0x08, 0xbb, 0xc6, 0x20, 0xaa, 0xa9, 0x88,
	0xfd, 0xc4, 0xcb, 0x7c, 0x3e, 0xd4, 0xe9, 0x67, 0xd8, 0x27, 0x36, 0x11, 0x8f, 0x20, 0x6c, 0x7a,
	0x95, 0x41, 0x15, 0x7b, 0x89, 0x9f, 0x45, 0x87, 0x07, 0xf9, 0x7f, 0x9e, 0x9c, 0x5f, 0xf7, 0xe7,
	0x83, 0x28, 0xfd, 0x33, 0x82, 0x90, 0x9a, 0x65, 0x65, 0xd8, 0x43, 0x08, 0xac, 0xb4, 0x2d, 0xc6,
	0x5e, 0xe2, 0x65, 0xfb, 0xdc, 0x15, 0xec, 0x1d, 0x44, 0x9d, 0xfd, 0xd9, 0xa2, 0x38, 0xa5, 0xde,
	0x6e, 0xe2, 0x65, 0xd1, 0xe1, 0xa3, 0xf5, 0x35, 0x34, 0xc7, 0xdc, 0xf5, 0xf1, 0xca, 0xf2, 0x4d,
	0x2e, 0xcd, 0xb1, 0xac, 0x9d, 0xa7, 0x4f, 0x9e, 0x43, 0xcd, 0x8e, 0x60, 0xec, 0xa8, 0xf3, 0x35,
	0x63, 0xef, 0x76, 0xe7, 0x7f, 0xe8, 0xec, 0x00, 0x82, 0x46, 0xb7, 0xda, 0xc4, 0x3b, 0xa4, 0xbb,
	0xbb, 0xd6, 0x1d, 0xf7, 0x20, 0x77, 0x3d, 0xf6, 0x16, 0x02, 0x69, 0x71, 0xd1, 0xc5, 0x01, 0xa5,
	0xf3, 0x64, 0x7b, 0x3a, 0x65, 0x65, 0xa6, 0x16, 0x17, 0xdc, 0xf1, 0xd9, 0x0b, 0xb8, 0x5f, 0xf7,
	0xe8, 0xd2, 0x5a, 0xad, 0x3e, 0x49, 0x21, 0x50, 0xc5, 0xa3, 0xc4, 0xcb, 0x42, 0x7e, 0x03, 0x4f,
	0x7f, 0x7b, 0x70, 0x67, 0xd3, 0x63, 0x4b, 0x90, 0x2f, 0x61, 0x47, 0x36, 0x5a, 0x51, 0x12, 0x1b,
	0x73, 0x4e, 0xfb, 0xa5, 0x39, 0x31, 0x1c, 0x3b, 0xbd, 0x34, 0x0d, 0x72, 0x22, 0xb1, 0xe7, 0x10,
	0xf6, 0xe7, 0xa9, 0x54, 0x96, 0xee, 0xbd, 0x31, 0xe0, 0xd0, 0xee, 0x53, 0x16, 0xb2, 0xab, 0xea,
	0x16, 0x05, 0x65, 0x11, 0xf2, 0xa1, 0x66, 0x09, 0x44, 0x5a, 0xcd, 0x0c, 0x76, 0xdd, 0xc7, 0xa5,
	0x6a, 0xe2, 0x80, 0xde, 0xb3, 0x09, 0xa5, 0x8f, 0x01, 0xe8, 0xed, 0x1f, 0x2e, 0x50, 0x59, 0x36,
	0x86, 0x91, 0x14, 0xb4, 0x4a, 0x3e, 0x1f, 0x49, 0x51, 0x9e, 0xc0, 0x33, 0xa9, 0xf3, 0x61, 0x95,
	0x57, 0x07, 0xed, 0xed, 0xb5, 0x0c, 0xcb, 0x68, 0x56, 0x0f, 0x6b, 0xf9, 0x6d, 0x6f, 0x85, 0xfe,
	0x1a, 0xdd, 0xfb, 0x42, 0x8a, 0xf7, 0xae, 0x9e, 0x95, 0xf5, 0x2e, 0x69, 0x5f, 0xff, 0x0d, 0x00,
	0x00, 0xff, 0xff, 0xfd, 0xb1, 0xc0, 0x3b, 0x91, 0x03, 0x00, 0x00,
}
