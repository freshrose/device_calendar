class RetrieveEventsParams {
  final List<String>? externalEventIds;
  final List<String>? eventIds;
  final DateTime? startDate;
  final DateTime? endDate;

  const RetrieveEventsParams({this.externalEventIds, this.eventIds, this.startDate, this.endDate});
}
